package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

public class WaterVehicle extends Vehicle{

    private double gpsLocation;

    public WaterVehicle(int weight, int price, Person person) {
        super(weight, price, person);
        this.gpsLocation = 10432.03;
    }


    public void go(){
        this.gpsLocation = (Math.random() *500000) +1;
    }
}
