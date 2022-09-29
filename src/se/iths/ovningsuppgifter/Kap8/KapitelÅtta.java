package se.iths.ovningsuppgifter.Kap8;

import java.util.ArrayList;

public class KapitelÅtta {
    public static void main(String[] args) {

                Stack stack = new Stack();

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(8);


        stack.showChronological();
        System.out.println("__________");
        stack.showbackwards();

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