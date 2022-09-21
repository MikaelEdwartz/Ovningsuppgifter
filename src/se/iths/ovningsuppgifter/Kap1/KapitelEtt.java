package se.iths.ovningsuppgifter.Kap1;

import java.util.Scanner;

public class KapitelEtt {
    public static void main(String[] args) {

        greeting();
        sumAndProduct();
        decimal();
        average();
        interest();


    }


    // Uppgift 1
    /*
     * 1)
     * 15
     * 9
     * 360  120 + 120*2
     * anfäkta
     * an be an do be
     * (2 * 4 + 8) / 4 - 8 + 4 / (2*8/2)  16 / 4 -8 + 4 / 8  4 - 8 + 0.5 vilket blir 0 så 4 - 8 = -4
     *
     * */

    //Uppgift 2 och 3


    public static void greeting() {
        //skapar en skannen
        Scanner scanner = new Scanner(System.in);
        //printar ut en fråga om namn och sparar det i en variabel
        System.out.println("Vad är ditt namn?");
        String name = scanner.nextLine();
        // printar ut namnet och frågar efter ett tal
        System.out.println("Hej " + name + "!");
        System.out.println("Vänligen skriv in ett tal");
        //sparar siffran och printar ut det
        int numInput = Integer.parseInt(scanner.nextLine());
        System.out.println(numInput);

    }

    //Uppgift 4
    public static void sumAndProduct() {
        //frågar efter 2 siffror användaren vill veta summan och produkten av
        System.out.println("Vänlingen skriv in två nummer du vill veta summan och produkten av");
        Scanner scanner = new Scanner(System.in);
        //sparar de 2 siffrorna i två variabler
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        //gör uträkningarna samt printar ut svaren
        System.out.println("Summan är " + (number + number2));
        System.out.println("Produkten är " + number * number2);


    }

    //Uppgift 5
    public static void decimal() {
        //frågar användaren efter ett decimaltal
        System.out.println("Skriv in ett decimaltal, (använd komma.)");
        Scanner scanner = new Scanner(System.in);
        // sparar siffran i en variabel och omvandlar sedan till en int, samt printar ut
        double number = scanner.nextDouble();
        int doubleToInt = (int) number;
        System.out.println(doubleToInt);


    }

    //Uppgift 6
    public static void average() {
        //frågar användaren efter 2 olika siffror
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad god skriv in 2 olika siffror");
        // sparar inputen i två variabler
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        //räknar ut vad medelvärdet av de två talen var samt printar ut
        System.out.println((double) (number1 + number2) / 2);
    }

    //Uppgift 7
    public static void interest() {
        //frågar hur mycket pengar som finns på kontot och sparar det i en variabel
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur mycket pengar har du på ditt konto?");
        double moneyOnAccount = scanner.nextDouble();
        //frågar användaren hur mycket räntan är
        System.out.println("Vad är räntan? Svara i heltal (t.ex 2 för 2%)");
        double inputInterest = scanner.nextDouble();
        //omvandlar inputen till rätt format för att räkna ut räntan samt räknar ut vad det är efter räntan
        double interest = (inputInterest / 100) + 1;
        double moneyAfterInterest = moneyOnAccount * (1 + interest);
        //printar ut svaret
        System.out.println(moneyAfterInterest + " kr");

    }


}
