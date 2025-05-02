
package model;

public class RouteSuggestion {
       private int suggestionId;
    private int restaurantId;
    private String routeMode;
    private double distance;
    private int estimatedTime;
    private String crowdLevel;
    private Timestamp createdAt;

    public RouteSuggestion(int suggestionId, int restaurantId, String routeMode, double distance, int estimatedTime, String crowdLevel, Timestamp createdAt) {
        this.suggestionId = suggestionId;
        this.restaurantId = restaurantId;
        this.routeMode = routeMode;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
        this.crowdLevel = crowdLevel;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(int suggestionId) {
        this.suggestionId = suggestionId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(String routeMode) {
        this.routeMode = routeMode;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getCrowdLevel() {
        return crowdLevel;
    }

    public void setCrowdLevel(String crowdLevel) {
        this.crowdLevel = crowdLevel;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
