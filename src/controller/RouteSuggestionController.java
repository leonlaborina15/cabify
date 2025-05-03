package controller;

import model.RouteSuggestion;

public class RouteSuggestionController {
    public void addRouteSuggestion(RouteSuggestion suggestion) {
        System.out.println("Added route suggestion for restaurant ID: " + suggestion.getRestaurantId());
    }
}