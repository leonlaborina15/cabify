package controller;

import model.Restaurant;

public class RestaurantController {
    public void updateCurrentCapacity(Restaurant restaurant, int newCapacity) {
        restaurant.setCurrentCapacity(newCapacity);
        System.out.println("Updated current capacity for restaurant: " + restaurant.getName());
    }

    public void changeStatus(Restaurant restaurant, String newStatus) {
        restaurant.setStatus(newStatus);
        System.out.println("Changed status of restaurant: " + restaurant.getName() + " to " + newStatus);
    }
}