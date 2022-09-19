package se.iths.ovningsuppgifter.Kap7.Vehicles;

public class Boat extends Vehicle{

    public Boat(){
        super();
    }

    @Override
    public void goTo(String dest){

        System.out.println("Färdas med båt till " + dest);
    }
}
