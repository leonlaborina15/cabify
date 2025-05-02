
package model;


public class Subscription {
     private int subscriptionId;
    private int userId;
    private int restaurantId;
    private String subscriptionType;
    private String status;
    private Timestamp createdAt;

    public Subscription(int subscriptionId, int userId, int restaurantId, String subscriptionType, String status, Timestamp createdAt) {
        this.subscriptionId = subscriptionId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.subscriptionType = subscriptionType;
        this.status = status;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
