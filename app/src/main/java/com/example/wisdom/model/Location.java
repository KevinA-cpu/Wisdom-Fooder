package com.example.wisdom.model;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Location {

    String locationName;
    String locationAddress;
    String locationRating;
    String locationDistance;
    List<Food> foodList;

    public Location(String locationName, String locationAddress, String locationRating, String locationDistance, List<Food> foodList) {
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.locationRating = locationRating;
        this.locationDistance = locationDistance;
        this.foodList = foodList;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationRating() {
        return locationRating;
    }

    public void setLocationRating(String locationRating) {
        this.locationRating = locationRating;
    }

    public String getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(String locationDistance) {
        this.locationDistance = locationDistance;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
