package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

public class Vehicle {
    private int weight;
    private int price;
    private Person person;

    public Vehicle(int weight, int price, Person person){
        this.weight = weight;
        this.price = price;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
