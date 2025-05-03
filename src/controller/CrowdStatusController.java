package controller;

import model.CrowdStatus;

public class CrowdStatusController {
    public void updateCrowdStatus(CrowdStatus crowdStatus, double newPercentage, int newWaitTime) {
        crowdStatus.setCrowdPercentage(newPercentage);
        crowdStatus.setWaitTime(newWaitTime);
        System.out.println("Crowd status updated for restaurant ID: " + crowdStatus.getRestaurantId());
    }
}