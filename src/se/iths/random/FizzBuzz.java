package se.iths.random;

import javax.sound.midi.Sequence;

public class FizzBuzz {

    /*Write a method that returns the nth element of the Fibonacci Sequence
    The Fibonacci javax.sound.midi.Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
    The next number is found by adding up the two numbers before it.
    Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...*/

    public static void main(String[] args) {

        printFizzBuzz();

    }

    private static void printFizzBuzz() {
        for (int i = 0; i < 100 ; i++) {
            fizzBuzz(i);
        }
    }

    public static void fizzBuzz(int i ){
        if(i % 15 == 0)
            System.out.println("FizzBuzz");
        else if(i % 5 == 0)
            System.out.println("Buzz");
        else if(i % 3 == 0)
            System.out.println("Fizz");
        else
            System.out.println(i);
    }

    public static void fibonacci(int i){
        int f = 0;
        int a = 1;
        int sum = 0;
        int help;
        for (int j = 0; j < i; j++) {


            help = f + a;

            sum = sum + help;



        }

    }

}
