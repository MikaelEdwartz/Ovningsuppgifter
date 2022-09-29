package se.iths.ovningsuppgifter.Kap8;

import java.util.ArrayList;

public class KapitelÅtta {
    public static void main(String[] args) {

        Safe s = new Safe();
        s.store(5);

        System.out.println("_______");
        s.print();

        System.out.println("________");
        s.retrieve();

        excersice2();

    }


    public static void excersice2(){
        var list = new ArrayList<Double>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.random());
        }
        list.forEach(s -> System.out.println(s));

    }

    public static void excerise3(){



    }


}