package se.iths.ovningsuppgifter.Kap6;

public class KapitelSex {

    public static void main(String[] args) {

        Animal katt = new Animal("Katt", "Kalle", 1);
        Animal hund = new Animal("Hund", "Berra", 3);

        Car car = new Car("Toyota", "red", 1000);
         /*   Car bil = new Car("Toyota", "röd", 1000);
            System.out.println(bil.getPrice());
            bil.setPrice(15000);
        System.out.println(bil.getPrice());
        */

        Pancakes pannakaka = new Pancakes();

        while(pannakaka.canMakePancakes())
            pannakaka.makePancakes();

    }








}


