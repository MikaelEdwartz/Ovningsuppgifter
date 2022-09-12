package se.iths.ovningsuppgifter.Kap6;


public class Car {
    private String brand;
    private String color;
    private int price;

    public Car(String brand, String color, int pris){

        this.brand = brand;
        this.color = color;
        this.price = pris;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = this.price + price;
    }

}
