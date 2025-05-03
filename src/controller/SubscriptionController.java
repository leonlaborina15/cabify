package controller;

import model.Subscription;

public class SubscriptionController {
    public void changeSubscriptionStatus(Subscription subscription, String newStatus) {
        subscription.setStatus(newStatus);
        System.out.println("Changed subscription status to: " + newStatus);
    }
}