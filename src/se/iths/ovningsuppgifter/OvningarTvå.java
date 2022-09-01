package se.iths.ovningsuppgifter;

import java.io.Console;
import java.util.Scanner;

public class OvningarTvå {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        //   exercise3();
        //   exercise4(scanner);
        //   exercise5(scanner);
        //   exercise6(scanner);
        //   exercise7();
        //   exercise8();
        //   exercise9();
        //   exercise10();
        //   exercise11();

    }

    private static void exercise11() {
        int input = 3;
        while(input > 2){

            if(input % 2 == 0){
                input = input / 2;
            } else{
                input = input * 3 + 1;
            }
        }
    }

    private static void exercise10() {
        String input = "";
        String completeInput = "";
        while (!input.isEmpty()) {
            completeInput = completeInput + input;
        }
        System.out.println(completeInput);
    }

    private static void exercise9() {
        int number = 65536;
        while(number > 2){
            number /= 2;
        }
    }

    private static void exercise8() {
        for (int i = 20; i >= 2; i--) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    private static void exercise6(Scanner scanner) {
        int randomNumber = (int) Math.random() * 100 + 1;

        while(true){
            int input = scanner.nextInt();
            if(input > randomNumber){
                System.out.println("Din gissning är för hög.");
            } else if (input < randomNumber){
                System.out.println("Din gissning är för låg!");
            } else{
                System.out.println("Rätt!");
                break;
            }
        }
    }

    private static void exercise5(Scanner scanner) {
        String input = scanner.next();

        switch (input) {
            case "januari" -> System.out.println(1);
            case "februari" -> System.out.println(2);
            case "mars" -> System.out.println(3);
            case "april" -> System.out.println(4);
            case "maj" -> System.out.println(5);
            case "juni" -> System.out.println(6);
            case "juli" -> System.out.println(7);
            case "augusti" -> System.out.println(8);
            case "september" -> System.out.println(9);
            case "oktober" -> System.out.println(10);
            case "november" -> System.out.println(11);
            case "december" -> System.out.println(12);

        }
    }


    private static void exercise4(Scanner scanner) {
        while(true) {
            int biggerThan100 = scanner.nextInt();

            if (biggerThan100 > 100) {
                System.out.println("Talet är större än 100");
            } else if (biggerThan100 < 100) {
                System.out.println("Talet är mindre än 100");
            } else {
                System.out.println("Talet är 100!");
            }


        }
    }

    private static void exercise3() {
        Console c = System.console();
        System.out.println("Hitta på ett lösenord");
        String password = "password";

        while(true){
            System.out.println("Skriv in ditt lösenord");
            String input = "";

                input = c.readLine();

            if(input.equals(password))
                break;

        }
        System.out.println("Fel lösenord");



    }


    //Uppgift 7
    private static void exercise7() {
        for (int i = 1; i <= 16; i++) {
            System.out.println(i);


        }
    }
}

/*¨
*
*
*
*
*
*
*
* */

