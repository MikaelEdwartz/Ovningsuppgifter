package se.iths.ovningsuppgifter.Kap6;

import java.math.BigDecimal;

public class Car {
    private String brand;
    private String color;
    private BigDecimal price;

    public Car(){

    }
    public Car(String brand, String color, BigDecimal price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
