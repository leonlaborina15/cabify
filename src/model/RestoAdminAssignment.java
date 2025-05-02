
package model;


public class RestoAdminAssignment {
   private int assignmentId;
    private int restaurantId;
    private int adminId;
    private Timestamp assignedAt;

    public RestoAdminAssignment(int assignmentId, int restaurantId, int adminId, Timestamp assignedAt) {
        this.assignmentId = assignmentId;
        this.restaurantId = restaurantId;
        this.adminId = adminId;
        this.assignedAt = assignedAt;
    }

    // Getters and Setters
    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public Timestamp getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(Timestamp assignedAt) {
        this.assignedAt = assignedAt;
    }
}
