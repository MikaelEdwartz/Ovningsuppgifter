package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

public class LandVehicle extends Vehicle{
    private int kilometer;

    public LandVehicle(int weight, int price, Person person) {
        super(weight, price, person);
        this.kilometer = 0;
    }

    public void drive(int kilometer){
        this.kilometer += kilometer;
    }
}
