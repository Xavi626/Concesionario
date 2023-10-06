package org.example.entitiy;

public class Car {
    private int Id;
    private String brand;
    private String model;
    private int cv;
    private int price;
    private String color;
    private boolean available;

    public Car(){}

    public Car(int id, String brand, String model, int cv, int price, String color, boolean available) {
        Id = id;
        this.brand = brand;
        this.model = model;
        this.cv = cv;
        this.price = price;
        this.color = color;
        this.available = available;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
