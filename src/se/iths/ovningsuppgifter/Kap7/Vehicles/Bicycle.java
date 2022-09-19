package se.iths.ovningsuppgifter.Kap7.Vehicles;

public class Bicycle extends Vehicle{

    public Bicycle(){
        super();
    }
    @Override
    public void goTo(String dest){

        System.out.println("Färdas med cykel till " + dest);
    }

}
