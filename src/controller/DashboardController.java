package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DatabaseConnection;

public class DashboardController {

    public int getTotalUsers() {
        int totalUsers = 0;
        String sql = "SELECT COUNT(*) AS total FROM user";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                totalUsers = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalUsers;
    }

    public int getTotalRestaurants() {
        int totalRestaurants = 0;
        String sql = "SELECT COUNT(*) AS total FROM restaurant";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                totalRestaurants = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalRestaurants;
    }

public List<String[]> getAllRestaurants() {
    List<String[]> restaurants = new ArrayList<>();
    String sql = "SELECT r.name AS restaurant_name, r.location, r.max_capacity, " +
                 "COALESCE(u.name, 'No Admin Assigned') AS admin_name " +
                 "FROM restaurant r " +
                 "LEFT JOIN user u ON r.admin_id = u.user_id";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            String name = rs.getString("restaurant_name");
            String location = rs.getString("location");
            String maxCapacity = String.valueOf(rs.getInt("max_capacity"));
            String adminName = rs.getString("admin_name");
            restaurants.add(new String[]{name, location, maxCapacity, adminName});
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return restaurants;
}
}