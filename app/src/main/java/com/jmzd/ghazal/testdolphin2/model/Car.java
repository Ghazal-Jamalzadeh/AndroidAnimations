package com.jmzd.ghazal.testdolphin2.model;

public class Car {
    private String model = "" ;
    private int price = 0 ;
    private String description = "" ;
    private int image ;

    public Car(String model, int price, String description , int image) {
        this.model = model;
        this.price = price;
        this.description = description;
        this.image = image ;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
