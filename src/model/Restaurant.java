package model;

import java.sql.Timestamp;

public class Restaurant {
    private int restaurantId;
    private String name;
    private String location;
    private int maxCapacity;
    private int currentCapacity;
    private String status;
    private String gpsCoordinates;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private double crowdPercentage;
    private int waitTime;
    private int id;

    // Default constructor
    public Restaurant() {}

    // Full constructor
    public Restaurant(int restaurantId, String name, String location, int maxCapacity, int currentCapacity, String status, String gpsCoordinates, Timestamp createdAt, Timestamp updatedAt, double crowdPercentage, int waitTime) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.location = location;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
        this.status = status;
        this.gpsCoordinates = gpsCoordinates;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.crowdPercentage = crowdPercentage;
        this.waitTime = waitTime;
    }

    // Getters and Setters
    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGpsCoordinates() {
        return gpsCoordinates;
    }

    public void setGpsCoordinates(String gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
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
    
    public void setId(int restaurantId) {
    this.restaurantId = id;
    }
}