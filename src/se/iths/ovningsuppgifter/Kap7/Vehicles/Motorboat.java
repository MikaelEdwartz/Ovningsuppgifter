package se.iths.ovningsuppgifter.Kap7.Vehicles;

public class Motorboat extends Vehicle{

    public Motorboat(){
        super();

    }
    @Override
    public void goTo(String dest){

        System.out.println("Färdas med motorbåt till " + dest);
    }

}
