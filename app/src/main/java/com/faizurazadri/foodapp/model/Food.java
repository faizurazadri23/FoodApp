package com.faizurazadri.foodapp.model;

public class Food {

    private String food_name;
    private String food_Description;
    private String food_address;
    private int food_image;
    private String food_rate;

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_Description() {
        return food_Description;
    }

    public void setFood_Description(String food_Description) {
        this.food_Description = food_Description;
    }

    public String getFood_address() {
        return food_address;
    }

    public void setFood_address(String food_address) {
        this.food_address = food_address;
    }

    public int getFood_image() {
        return food_image;
    }

    public void setFood_image(int food_image) {
        this.food_image = food_image;
    }

    public String getFood_rate() {
        return food_rate;
    }

    public void setFood_rate(String food_rate) {
        this.food_rate = food_rate;
    }
}
