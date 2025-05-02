
package model;

public class CrowdStatus {
     private int statusId;
    private int restaurantId;
    private double crowdPercentage;
    private int waitTime;
    private Timestamp createdAt;

    public CrowdStatus(int statusId, int restaurantId, double crowdPercentage, int waitTime, Timestamp createdAt) {
        this.statusId = statusId;
        this.restaurantId = restaurantId;
        this.crowdPercentage = crowdPercentage;
        this.waitTime = waitTime;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public double getCrowdPercentage() {
        return crowdPercentage;
    }

    public void setCrowdPercentage(double crowdPercentage) {
        this.crowdPercentage = crowdPercentage;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
