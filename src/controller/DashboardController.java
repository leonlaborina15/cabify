package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DatabaseConnection;

public class DashboardController {

    // Get the total number of users
    public int getTotalUsers() {
        int totalUsers = 0;
        String sql = "SELECT COUNT(*) AS total FROM user";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                totalUsers = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalUsers;
    }

    // Get the total number of restaurants
    public int getTotalRestaurants() {
        int totalRestaurants = 0;
        String sql = "SELECT COUNT(*) AS total FROM restaurant";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                totalRestaurants = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalRestaurants;
    }

    // Get all restaurants with admin name (or "No Admin Assigned" if none)
    public List<String[]> getAllRestaurants() {
        List<String[]> restaurants = new ArrayList<>();
        String sql = "SELECT r.restaurant_id, r.name AS restaurant_name, r.location, r.max_capacity, "
                + "COALESCE(u.name, 'No Admin Assigned') AS admin_name "
                + "FROM restaurant r "
                + "LEFT JOIN user u ON r.admin_id = u.user_id";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String restoId = rs.getString("restaurant_id");
                String name = rs.getString("restaurant_name");
                String location = rs.getString("location");
                String maxCapacity = String.valueOf(rs.getInt("max_capacity"));
                String adminName = rs.getString("admin_name");
                restaurants.add(new String[]{restoId, name, location, maxCapacity, adminName});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return restaurants;
    }

    // Get all users (for populating dropdown)
    public List<String[]> getAllUsers() {
        List<String[]> users = new ArrayList<>();
        String sql = "SELECT user_id, name FROM user";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String id = rs.getString("user_id");
                String name = rs.getString("name");
                users.add(new String[]{id, name});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    // Get all admins (not currently used, but can be useful)
    public List<String> getAllAdmins() {
        List<String> admins = new ArrayList<>();
        String sql = "SELECT name FROM user WHERE role = 'Resto Admin'";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                admins.add(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admins;
    }

    // Delete a restaurant by its ID
    public boolean deleteRestaurantById(String restaurantId) {
        String sql = "DELETE FROM restaurant WHERE restaurant_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, restaurantId);
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Update restaurant (including admin assignment)
    public boolean updateRestaurantAdmin(String restaurantId, String adminId, String name, String location, int capacity) {
        String sql = "UPDATE restaurant SET name = ?, location = ?, max_capacity = ?, admin_id = ? WHERE restaurant_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, location);
            stmt.setInt(3, capacity);
            if (adminId == null) {
                stmt.setNull(4, java.sql.Types.VARCHAR);
            } else {
                stmt.setString(4, adminId);
            }
            stmt.setString(5, restaurantId);
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Add restaurant (including admin assignment)
    public boolean addRestaurant(String name, String location, int capacity, String adminId) {
        String sql = "INSERT INTO restaurant (name, location, max_capacity, admin_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, location);
            stmt.setInt(3, capacity);
            if (adminId == null) {
                stmt.setNull(4, java.sql.Types.VARCHAR);
            } else {
                stmt.setString(4, adminId);
            }
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean setUserRoleToAdmin(String userId) {
        String sql = "UPDATE user SET role = 'Resto Admin' WHERE user_id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<String[]> getAllLogs() {
        List<String[]> logs = new ArrayList<>();
        String sql = "SELECT l.log_id, u.name AS user_name, l.action, l.description, l.created_at "
                + "FROM audit_log l "
                + "JOIN user u ON l.user_id = u.user_id "
                + "ORDER BY l.created_at DESC";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String logId = rs.getString("log_id");
                String userName = rs.getString("user_name");
                String action = rs.getString("action");
                String desc = rs.getString("description");
                String createdAt = rs.getString("created_at");
                logs.add(new String[]{logId, userName, action, desc, createdAt});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return logs;
    }
    
    public boolean sendNotification(String message, String category) {
    String sql = "INSERT INTO notification (user_id, restaurant_id, message, notification_type, status, created_at) " +
                 "VALUES (?, ?, ?, ?, ?, NOW())";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setNull(1, java.sql.Types.INTEGER);
        stmt.setNull(2, java.sql.Types.INTEGER); 
        stmt.setString(3, message);
        stmt.setString(4, category);
        stmt.setString(5, "Pending");
        int rows = stmt.executeUpdate();
        return rows > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    
    public void addAuditLog(int userId, String action, String description) {
    String sql = "INSERT INTO audit_log (user_id, action, description) VALUES (?, ?, ?)";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, userId);
        stmt.setString(2, action);
        stmt.setString(3, description);
        stmt.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
