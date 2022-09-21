package se.iths.ovningsuppgifter.Kap7.Vehicles;

public class Vehicle {

    public Vehicle(){

    }
    public void goTo(String dest){

        System.out.println("Färdas till " + dest);
    }
    





}





/*Skapa en klasshierarki för olika sorters fordon.
Du ska alltså skapa klasser som ärver från varandra.
Du ska ha klasserna Vehicle, Bicycle, Boat, Car, Motorboat och Sail. Vehicle ska ha en metod som heter goTo,
 som tar en parameter. Funktionen ska skriva ut "Färdas till [parametern]".
 Skapa ett objekt av varje klass och anropa goTo med ditt favoritresmål.
 */