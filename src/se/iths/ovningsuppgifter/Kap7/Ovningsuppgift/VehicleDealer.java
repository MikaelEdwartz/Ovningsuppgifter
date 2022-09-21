package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;


public class VehicleDealer extends Person{


    public VehicleDealer(String name, String work, int age, double money) {
        super(name, work, age, money);
    }


    public String changeOwner(Vehicle vehicle, Person seller, Person buyer){
        if(!(gotMoney(vehicle, buyer)))
            return "Buyer cannot afford vehicle";

        if((buyer.checkIfVehicle()))
            return "Buyer cannot buy more than 1 vehicle";

        vehicle.setPerson(buyer);
        seller.setMoney(vehicle.getPrice()-getDealersCut(vehicle));
        this.setMoney(getDealersCut(vehicle));

        buyer.setHasVehicle(true);
        return "Vehicle changed hands";

    }
    public double getDealersCut(Vehicle vehicle){
        return vehicle.getPrice()*0.1;
    }

    public boolean gotMoney(Vehicle vehicle, Person buyer){
     return vehicle.getPrice() < buyer.getMoney();
    }

}