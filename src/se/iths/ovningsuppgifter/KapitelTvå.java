package se.iths.ovningsuppgifter;

import java.util.Scanner;

public class KapitelTvå {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        exercise3(scanner);
        exercise4(scanner);
        exercise5(scanner);
        exercise6(scanner);
        exercise7();
        exercise8();
        exercise9();
        exercise10(scanner);
        exercise11();

    }


    private static void exercise3(Scanner scanner) {
        //skapar ett lösenord
        String password = "password";

        while (true) {
            //ber användaren skriva in lösenord, gissar användaren rätt går vi ut ur loopen
            System.out.println("Skriv in ditt lösenord");
            String input = scanner.next();

            if (input.equals(password))
                break;
            //printar ut fel om lösenordet inte stämmer
            System.out.println("Fel lösenord");
        }

    }


    private static void exercise4(Scanner scanner) {
        //frågar användaren efter ett tal i en loop som körs tills break kommnadot nås
        while (true) {
            int biggerThan100 = scanner.nextInt();
            //är input högre än 100 printas det ut
            if (biggerThan100 > 100)
                System.out.println("Talet är större än 100");
                //är input mindre än 100 printas det ut
            else if (biggerThan100 < 100)
                System.out.println("Talet är mindre än 100");
                //är input 100 printas det ut och loopen avbryts
            else {
                System.out.println("Talet är 100!");
                break;
            }


        }
    }

    private static void exercise5(Scanner scanner) {
        //frågar användaren efter en månad
        String input = scanner.next();
        //printar ut nummervärdet av månaden som skrivs in
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

    private static void exercise6(Scanner scanner) {
        //skapar ett random värde mellan 1 och 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        //skapar en variabel som håller koll på antalet gissningar
        int numberOfGuesses = 0;
        //skapar en loop som beroende på input printar ut om gissningen är för låg eller för hög
        while (true) {

            int input = scanner.nextInt();
            System.out.println("Gör en gissning!");

            //lägger till antalet gissningar
            numberOfGuesses++;
            //är gissningen högre än det slumpade numret printas det ut
            if (input > randomNumber)
                System.out.println("Din gissning är för hög.");
                //är gissningen mindre än det slumpade numret printas det ut
             else if (input < randomNumber)
                System.out.println("Din gissning är för låg!");
                //är gissningen inte några av de ovanstående måste det ha blivit rätt och printas ut. Samt går ut ur loopen
             else {
                System.out.println("Rätt!");
                break;
            }
        }
        System.out.println("Du lyckades på " + numberOfGuesses + " gissningar");
    }


    //Uppgift 7
    private static void exercise7() {
        //skapar en for loop som kör 16 gånger och printar ut i varje gång loppen körs (printar ut 1-16)
        for (int i = 1; i <= 16; i++) {
            System.out.println(i);

        }
    }


    private static void exercise8() {
        //en for loop som körs 20 gånger och varje gång talet modulo 2 är lika med 0 printas talet ut.
        for (int i = 20; i >= 2; i--) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }


    private static void exercise9() {
        //initialerar ett tal
        int number = 65536;
        //medans talet är större än 2 printas det ut och divideras med 2
        while (number > 2) {
            System.out.println(number);
            number /= 2;

        }
    }


    private static void exercise10(Scanner scanner) {
        //initialerar fullständiga strängen
        String completeInput = "";
        //skapar en loop
        while (true) {
            //frågar användaren efter ett ord och sparar det i en variabel
            System.out.println("Skriv in ett ord");
            String input = scanner.nextLine();
            //om inputen är tom eller består av en punkt avbryts loopen och det fullständiga ordet printas ut
            if (input.equals("") || input.equals("."))
                break;
            //lägger ihop den fullständiga strängen med inputen
            completeInput = completeInput + input + " ";
        }
        //printar ut fullstänga strängen
        System.out.println(completeInput);
    }


    private static void exercise11() {
        //väljer ett tal som ska räknas ut kommer alltid köras tills att input är mindre än 2
        int input = 3;
        while (input > 2) {
            // om inputen modulo 2 är lika med 0 kommer inpute delas
            if (input % 2 == 0)
                input = input / 2;
                // om inputen modulo 2 är lika med 1 kommer inputen multipleras med 3 och adderas med 1
            else
                input = input * 3 + 1;
            //printar ut talet innan loopen startas om
            System.out.println(input);
        }
    }

}


