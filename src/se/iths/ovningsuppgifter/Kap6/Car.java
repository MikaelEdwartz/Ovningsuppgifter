package se.iths.ovningsuppgifter.Kap6;

import java.math.BigDecimal;

public class Car {
    private String brand;
    private String color;
    private int price;

    public Car(){

    }
    public Car(String brand, String color, int price){
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

    public int getPrice() {
        return price;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void halfPrice(){
        this.price /= 2;
    }
}
