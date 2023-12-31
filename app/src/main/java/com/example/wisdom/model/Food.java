package com.example.wisdom.model;

public class Food {

    String foodName;
    String foodDescription;
    String foodOriginalPrice;
    String foodDiscountedPrice;
    String foodAmount;

    int foodOrderAmount = 0;
    Integer foodImage;

    public Food(String foodName, String foodDescription, String foodOriginalPrice, String foodDiscountedPrice, String foodAmount, Integer foodImage) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodOriginalPrice = foodOriginalPrice;
        this.foodDiscountedPrice = foodDiscountedPrice;
        this.foodAmount = foodAmount;
        this.foodImage = foodImage;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getFoodOriginalPrice() {
        return foodOriginalPrice;
    }

    public void setFoodOriginalPrice(String foodOriginalPrice) {
        this.foodOriginalPrice = foodOriginalPrice;
    }

    public String getFoodDiscountedPrice() {
        return foodDiscountedPrice;
    }

    public void setFoodDiscountedPrice(String foodDiscountedPrice) {
        this.foodDiscountedPrice = foodDiscountedPrice;
    }

    public String getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(String foodAmount) {
        this.foodAmount = foodAmount;
    }

    public Integer getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(Integer foodImage) {
        this.foodImage = foodImage;
    }

    public int getFoodOrderAmount() {
        return foodOrderAmount;
    }

    public void setFoodOrderAmount(int foodOrderAmount) {
        this.foodOrderAmount = foodOrderAmount;
    }
}
