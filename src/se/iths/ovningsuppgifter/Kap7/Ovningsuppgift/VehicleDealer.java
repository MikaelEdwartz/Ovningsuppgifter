package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

import org.w3c.dom.ls.LSOutput;

public class VehicleDealer extends Person{


    public VehicleDealer(String name, String work, int age, double money) {
        super(name, work, age, money);
    }


    public String changeOwner(Vehicle vehicle, Person seller, Person buyer){
        if(!(gotMoney(vehicle, buyer)))
            return "Buyer cannot afford vehicle";

        vehicle.setPerson(buyer);
        seller.setMoney(vehicle.getPrice());



        return "Vehicle changed hands";

    }

    public boolean gotMoney(Vehicle vehicle, Person buyer){
     return vehicle.getPrice() < buyer.getMoney();
    }

}

/*¨Uppgift 4 Gör metoder till fordonshandlaren så ett fordon kan byta ägare.
Ett fordon ska inte bara byta ägare, utan säljaren ska få pengar av köparen och fordonshandlaren ska få sin andel.
Säljaren ska bara kunna bli av med ett fordon och en köpare ska bara kunna få ett. */