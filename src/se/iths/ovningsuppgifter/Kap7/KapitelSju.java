package se.iths.ovningsuppgifter.Kap7;

import se.iths.ovningsuppgifter.Kap7.Animals.Cat;
import se.iths.ovningsuppgifter.Kap7.Vehicles.*;

public class KapitelSju {

    public static void main(String[] args) {

        Cat cat = new Cat();


        System.out.println("_____________");
        cat.speak();
        System.out.println(cat);

        Boat boat = new Boat();
        Car car = new Car();
        Motorboat mBoat = new Motorboat();
        Sail sail = new Sail();
        Bicycle bicycle = new Bicycle();

        boat.goTo("Slöinge");
        car.goTo("Åstorp");
        mBoat.goTo("Kortedala");
        sail.goTo("Dristla");
        bicycle.goTo("Falkenberg");


    }
}
