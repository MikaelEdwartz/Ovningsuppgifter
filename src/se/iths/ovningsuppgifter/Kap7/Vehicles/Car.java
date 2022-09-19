package se.iths.ovningsuppgifter.Kap7.Vehicles;

public class Car extends Vehicle {

    public Car(){
        super();

    }
    @Override
    public void goTo(String dest) {

        System.out.println("Färdas med bil till " + dest);
    }

}
