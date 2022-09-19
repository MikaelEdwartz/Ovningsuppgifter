package se.iths.ovningsuppgifter.Kap6;

import java.util.Arrays;

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
        Semaphore f = Semaphore.request();
        Semaphore g = Semaphore.request();

        for (Semaphore semaphore1 : Arrays.asList(a, b, c, d, e)) {
            System.out.println(semaphore1.toString());
        }
        System.out.println("__________");
        System.out.println(a);
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f);
        System.out.println(g);
        e.release();
        System.out.println("__________");
        System.out.println(a);
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f);
        System.out.println(g);
        System.out.println("__________");
        c.release();
        System.out.println(a);
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f);
        System.out.println(g);
        System.out.println("__________");
        while(pannakaka.canMakePancakes())
            pannakaka.makePancakes();

    }








}


