package se.iths.ovningsuppgifter.Kap6;

public class KapitelSex {

    public static void main(String[] args) {

        Animal katt = new Animal("Katt", "Kalle", 1);
        Animal hund = new Animal("Hund", "Berra", 3);

        Car car = new Car("Toyota", "red", 1000);

        Pancakes pannakaka = new Pancakes();

        Semaphore a = Semaphore.request();
        Semaphore b = Semaphore.request();
        Semaphore c = Semaphore.request();
        Semaphore d = Semaphore.request();
        Semaphore e = Semaphore.request();

        while(pannakaka.canMakePancakes())
            pannakaka.makePancakes();

    }








}


