package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

public class AirVehicle extends Vehicle{
    public boolean isFlying;
    private int height;

    public AirVehicle(int weight, int price, Person person) {
        super(weight, price, person);
        height = 0;
        isFlying = true;
    }

    public void fly(boolean isFlying){
        if (!(isFlying))
            System.out.println("LANDA");

        height += 10;
    }
}
