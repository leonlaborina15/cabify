
package model;


public class Notification {
    private int notificationId;
    private int userId;
    private int restaurantId;
    private String message;
    private String notificationType;
    private String status;
    private Timestamp createdAt;

    public Notification(int notificationId, int userId, int restaurantId, String message, String notificationType, String status, Timestamp createdAt) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.message = message;
        this.notificationType = notificationType;
        this.status = status;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
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
