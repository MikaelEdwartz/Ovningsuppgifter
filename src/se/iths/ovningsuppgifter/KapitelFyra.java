package se.iths.ovningsuppgifter;

import java.util.Arrays;
import java.util.Scanner;

public class KapitelFyra {

    public static void main(String[] args) {
        /*exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();*/
        //exerciseFive();
        //exerciseSix();
        //exerciseSeven();
        //exerciseEight();
        sevenK();
    }


    public static void exerciseOne() {
        //skapar en array med informationen i uppgiften
        String[] array = {"gul", "grön", "orange", "blå", "grå"};
        //enchanced for loop för att skriva ut varje värde i arrayen
        for (String a : array) {
            System.out.println(a);
        }
    }

    public static void exerciseTwo() {
        //initialerar variabeln som ska innehålla totala summan
        int sum = 0;
        //skapar en array och lägger in värden
        int[] array = {2, 3, 5, 8, 13, 21, 34};
        //loopar igenom arrayen och lägger till varje värde i total summa variabeln
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //print totala summan
        System.out.println(sum);

    }

    public static void exerciseThree() {
        //skapar en variabel som håller koll på antalet udda tal
        int counter = 0;
        //skapar en variabel
        int[] array = new int[5];
        //loopar igenom arrayen och fyller med random nummer
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            //är talet udda ökar vi counter med 1
            if (array[i] % 2 == 1)
                counter++;
        }
        //sorterar array
        Arrays.sort(array);
        //printar ut högsta och lägsta, samt antalet udda
        System.out.println("Lägsta talet är " + array[0]);
        System.out.println("högsta talet är " + array[4]);
        System.out.println("antal udda tal är " + counter);

    }

    public static void exerciseFour() {
        Scanner scanner = new Scanner(System.in);
        //frågar efter hur stor arrayen ska vara
        int input = scanner.nextInt();
        //initialerar summan
        double sum = 0;
        //skapar array med storlek beroende på input
        int[] array = new int[input];
        //loopar igenom array och lägger till slumpade tal
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            //printar ut varje plats i arrayn
            System.out.println(array[i]);
            //lägger till varje värde till totalsumman
            sum = sum + array[i];

        }

        //printar ut summan delat på hur många värden det finns, så vi får medelvärdet
        System.out.println(sum / array.length);

    }

    public static void exerciseFive() {
        sevenA();
        System.out.println("----------------------------");
        sevenB();
        System.out.println("----------------------------");
        sevenC();
        System.out.println("----------------------------");
        sevenD();
        System.out.println("----------------------------");
        sevenE();
        System.out.println("----------------------------");
        sevenF();
        System.out.println("----------------------------");
        sevenG();
        System.out.println("----------------------------");
        sevenH();
        System.out.println("----------------------------");
        sevenI();
        System.out.println("----------------------------");
        sevenJ();
        System.out.println("----------------------------");
        sevenK();
        System.out.println("----------------------------");

    }

    private static void sevenK() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (i < 2 && j % 2 == 0 || i == 3)
                    System.out.print("##");
                else if (i < 2)
                    System.out.print("--");
                else if (j < 3)
                    System.out.print("WW");
                else
                    System.out.print("~~");
            }
            System.out.println("");
        }
    }

    private static void sevenJ() {
        int helper = 4;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2)
                    System.out.print("o");
                else if (j == i || j == helper)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            helper--;
            System.out.println("");

        }
    }

    private static void sevenI() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 2 && i != 1)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");
        }
    }

    private static void sevenH() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == i + 2)
                    System.out.print("#");
                else if (i < 2 && j > 4)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    private static void sevenG() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 3 && j < 3)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    private static void sevenF() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    System.out.print("#");
                else if (i % 2 == 1 && j % 2 == 1)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    private static void sevenE() {
        int helper = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == i || j == helper)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            helper--;
            System.out.println("");
        }
    }

    private static void sevenD() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 2 || j == 4)
                    System.out.print("#");
                else if (i == 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    private static void sevenA() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == i)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    private static void sevenB() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == i || j == i + 4)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    private static void sevenC() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == i || j == i + 1)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void exerciseSix(){
        //skapar en array och sätter in slumpade tal
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        //hjälp variabel
        int helper;
        //for loop som går igenom alla element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                //algoritm för att sortera
                if (array[j] < array[j + 1]) {
                    helper = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = helper;
                }
            }
        }
    }

    public static void exerciseSeven() {
        String[][] array = new String[4][8];
        //skapar en nässlad for loop som sätter in # ifall det kriteria möts annars sätts - in
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == i)
                    array[i][j] = "#";
                else if (j == i + 4)
                    array[i][j] = "#";
                else
                    array[i][j] = "-";
            }
        }
        //printar ut for loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }

    public static void exerciseEight() {
        String[][] array = new String[5][7];
        int verticalHelper = 3;
        int horizontalHelper = 3;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 7; j++) {

                    if (i == 0||j == 0 || i == array.length - 1 || j == 6 )
                        array[i][j] = "#";
                    else if (i == verticalHelper && j == horizontalHelper)
                        array[i][j] = "@";
                    else
                        array[i][j] = "-";
                }
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println("");
            }

            String input = scanner.nextLine();
            if (input.equals("w"))
                verticalHelper--;
            else if (input.equals("s"))
                verticalHelper++;
            else if(input.equals("a"))
                horizontalHelper--;
            else if(input.equals("d"))
                horizontalHelper++;



        }
    }
}
