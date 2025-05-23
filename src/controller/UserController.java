package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Statement;
import model.DatabaseConnection;
import model.User;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class UserController {
    private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final int MIN_PASSWORD_LENGTH = 8;

  
    public Optional<User> register(String name, String email, String password) throws SQLException, Exception {
        validateRegistrationInput(name, email, password);
        
        if (isEmailExists(email)) {
            throw new IllegalArgumentException("Email already registered");
        }

        Timestamp currentTime = new Timestamp(System.currentTimeMillis());

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = """
                INSERT INTO user (name, email, password, role, created_at, updated_at)
                VALUES (?, ?, ?, 'USER', ?, ?)
                """;
                
            try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, name.trim());
                stmt.setString(2, email.toLowerCase().trim());
                stmt.setString(3, password);
                stmt.setTimestamp(4, currentTime);
                stmt.setTimestamp(5, currentTime);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            Integer restaurantId = null;
                            return Optional.of(new User(
                                generatedKeys.getInt(1),
                                name,
                                email,
                                password,
                                "USER",
                                currentTime,
                                currentTime,
                                    restaurantId
                            ));
                        }
                    }
                }
            }
        }
        return Optional.empty();
    }

        public Optional<User> authenticate(String email, String password) throws SQLException, Exception {
    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = """
            SELECT u.*, r.restaurant_id
            FROM user u
            LEFT JOIN restaurant r ON r.admin_id = u.user_id
            WHERE u.email = ? AND u.password = ?
        """;
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email.toLowerCase().trim());
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Integer restaurantId = rs.getObject("restaurant_id") != null ? rs.getInt("restaurant_id") : null;

                    User user = new User(
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role"),
                        rs.getTimestamp("created_at"),
                        rs.getTimestamp("updated_at"),
                        restaurantId // Pass the restaurantId to the User object (update User class if needed)
                    );
                    updateLastLogin(email);
                    return Optional.of(user);
                }
            }
        }
    }
    return Optional.empty();
}
 
    public boolean updatePassword(int userId, String currentPassword, String newPassword) 
            throws SQLException, Exception {
        validatePassword(newPassword);

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT 1 FROM user WHERE user_id = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, userId);
                stmt.setString(2, currentPassword);
                
                if (stmt.executeQuery().next()) {
                    sql = "UPDATE user SET password = ?, updated_at = ? WHERE user_id = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(sql)) {
                        updateStmt.setString(1, newPassword);
                        updateStmt.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
                        updateStmt.setInt(3, userId);
                        return updateStmt.executeUpdate() > 0;
                    }
                }
            }
        }
        return false;
    }

    private void validateRegistrationInput(String name, String email, String password) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email format");
        }
        validatePassword(password);
    }

    private void validatePassword(String password) {
        if (password == null || password.length() < MIN_PASSWORD_LENGTH) {
            throw new IllegalArgumentException(
                "Password must be at least " + MIN_PASSWORD_LENGTH + " characters long"
            );
        }
    }

    private boolean isEmailExists(String email) throws SQLException, Exception {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT 1 FROM user WHERE email = ?")) {
            stmt.setString(1, email.toLowerCase().trim());
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    private void updateLastLogin(String email) throws Exception {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                 "UPDATE user SET updated_at = NOW() WHERE email = ?")) {
            stmt.setString(1, email);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            LOGGER.log(Level.WARNING, "Failed to update last login time", ex);
        }
    }
    public User getUserById(int userId) throws SQLException, Exception {
    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT * FROM user WHERE user_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Integer restaurantId = null;
                    return new User(
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role"),
                        rs.getTimestamp("created_at"),
                        rs.getTimestamp("updated_at"),
                        restaurantId
                    );
                }
            }
        }
    }
    return null;
}

public boolean updateUserProfile(int userId, String newName, String newEmail) throws SQLException, Exception {
    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "UPDATE user SET name = ?, email = ?, updated_at = NOW() WHERE user_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newName);
            stmt.setString(2, newEmail);
            stmt.setInt(3, userId);
            return stmt.executeUpdate() > 0;
        }
    }
}
}