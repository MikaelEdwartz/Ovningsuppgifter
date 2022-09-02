package se.iths.ovningsuppgifter;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OvningarEtt {
    public static void main(String[] args) {

        //greeting();
        //sumAndProduct();
        //decimal();
        //average();
        //interest();



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

    
    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad är ditt namn?");
        String name = scanner.nextLine();

        System.out.println("Hej " + name + "!");
        System.out.println("Vänligen skriv in ett tal");

        int numInput = Integer.parseInt(scanner.nextLine());

      

        System.out.println(numInput);

    }
    //Uppgift 4
    public static void sumAndProduct(){
        System.out.println("Vänlingen skriv in ett nummer du vill veta summan och produkten av");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Summan är " + (number + number));
        System.out.println("Produkten är " + (number * number));


    }
    //Uppgift 5
    public static void decimal(){

        System.out.println("Skriv in ett decimaltal, (använd komma.)");
        Scanner scanner = new Scanner(System.in);
        //
        double number = scanner.nextDouble();
        int doubleToInt = (int) number;
        System.out.println(doubleToInt);


    }
    //Uppgift 6
    public static void average(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad god skriv in 2 olika siffror");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println((double) (number1 + number2) / 2);
    }
    //Uppgift 7
    public static void interest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur mycket pengar har du på ditt konto?");

        double moneyOnAccount = scanner.nextDouble();
        System.out.println("Vad är räntan? Svara i heltal (t.ex 2 för 2%)");

        double interest = scanner.nextDouble();
        interest = (interest / 100) + 1;

        double moneyAfterInterest = moneyOnAccount * (1 + interest);
        System.out.println(moneyAfterInterest + " kr");

    }


    /*
    D
    D

    D
    D
    D
    D
    D
    D

    D
    D
     */
}
