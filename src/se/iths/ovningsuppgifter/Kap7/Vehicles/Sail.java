package se.iths.ovningsuppgifter.Kap7.Vehicles;

public class Sail extends Vehicle{

    public Sail(){
        super();

    }
    @Override
    public void goTo(String dest){

        System.out.println("Färdas med segelbåt till " + dest);
    }

}
