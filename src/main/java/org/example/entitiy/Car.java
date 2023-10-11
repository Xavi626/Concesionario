package org.example.entitiy;

import jakarta.persistence.*;

@Entity
@Table(name = "ob_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "cv")
    private int cv;

    @Column(name = "price")
    private int price;

    @Column(name = "priceRenting")
    private int priceRenting;

    public Car(){}

    public Car(int id, String brand, String model, int cv, int price, String color, int priceRenting) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.cv = cv;
        this.price = price;
        this.color = color;
        this.priceRenting = priceRenting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getPriceRenting() {
        return priceRenting;
    }

    public void setPriceRenting(int priceRenting) {
        this.priceRenting = priceRenting;
    }
}
