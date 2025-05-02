
package model;

public class RouteConfiguration {
     private int configId;
    private String apiProvider;
    private String apiKey;
    private String routeModes;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public RouteConfiguration(int configId, String apiProvider, String apiKey, String routeModes, Timestamp createdAt, Timestamp updatedAt) {
        this.configId = configId;
        this.apiProvider = apiProvider;
        this.apiKey = apiKey;
        this.routeModes = routeModes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    public String getApiProvider() {
        return apiProvider;
    }

    public void setApiProvider(String apiProvider) {
        this.apiProvider = apiProvider;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getRouteModes() {
        return routeModes;
    }

    public void setRouteModes(String routeModes) {
        this.routeModes = routeModes;
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
}
