package controller;

import java.util.ArrayList;
import java.util.List;
import model.Notification;

public class NotificationController {
    private List<Notification> notifications;

    public NotificationController() {
        this.notifications = new ArrayList<>();
    }

    public void sendNotification(Notification notification) {
        notification.setStatus("Sent");
        notifications.add(notification);
        System.out.println("Notification sent: " + notification.getMessage());
    }

    public List<Notification> getAllNotifications() {
        return notifications;
    }
}