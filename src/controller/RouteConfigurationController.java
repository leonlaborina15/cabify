package controller;

import model.RouteConfiguration;

public class RouteConfigurationController {
    public void updateApiKey(RouteConfiguration config, String newApiKey) {
        config.setApiKey(newApiKey);
        System.out.println("Updated API key for configuration ID: " + config.getConfigId());
    }
}