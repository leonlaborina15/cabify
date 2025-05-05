package controller;

import java.sql.*;
import model.Restaurant; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DatabaseConnection;

public class RestaurantController {

    public Restaurant getRestaurantById(int restaurantId) throws Exception {
        Restaurant resto = null;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT name, max_capacity, current_capacity FROM restaurant WHERE restaurant_id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, restaurantId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        resto = new Restaurant();
                        resto.setId(restaurantId);
                        resto.setName(rs.getString("name"));
                        resto.setMaxCapacity(rs.getInt("max_capacity"));
                        resto.setCurrentCapacity(rs.getInt("current_capacity"));
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resto;
    }

    public boolean updateCurrentCapacity(int restaurantId, int newCapacity) throws Exception {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE restaurant SET current_capacity = ? WHERE restaurant_id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, newCapacity);
                stmt.setInt(2, restaurantId);
                int affected = stmt.executeUpdate();
                return affected > 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}