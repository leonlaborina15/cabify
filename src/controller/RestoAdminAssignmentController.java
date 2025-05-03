package controller;

import model.RestoAdminAssignment;

public class RestoAdminAssignmentController {
    public void assignAdminToRestaurant(RestoAdminAssignment assignment, int adminId, int restaurantId) {
        assignment.setAdminId(adminId);
        assignment.setRestaurantId(restaurantId);
        System.out.println("Assigned admin ID: " + adminId + " to restaurant ID: " + restaurantId);
    }
}