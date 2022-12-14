package se.iths.ovningsuppgifter.Kap5;

import java.util.Date;

public class KapitelFem {

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            if(exercise13(i))
                System.out.println(i + " är ett primtal");
        }
    }


    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static int mulitply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static int mulitplyAll(int... a) {
        int sum = 1;
        for (int i : a) {
            sum = sum * i;
        }
        return sum;
    }

    public static String exercise3(String name, String city, int favouriteNumber) {
        return "Välkommen " + name + " från " + city + " med favorittal " + favouriteNumber;
    }

    public static int exercise4(String string) {
        int number = 1;
        try {
            number = Integer.valueOf(string);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return number;
    }

    public static String exercise5(String string) {
        return "</p>" + string + "</p>";
    }

    // public static
    public static void exercise6() {
    }

    public static void exercise7(String input) {
        String shortString = input.substring(0, 3);
        System.out.println(shortString);

    }

    public static int exercise8(String string) {
        int year = Integer.valueOf(string.substring(0, 4));
        return year;
    }

    public static void exercise9(Date dateOne, Date dateTwo) {
        System.out.println(dateOne.compareTo(dateTwo));
    }

    public static double exercise10(double fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }

    public static void exercise11(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum = sum + i;
        }

    }

    public static void exercise12(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }

    }

    public static boolean exercise13(int i) {


        double helper2 = (double) i / 2;
        double helper3 = (double) i / 3;
        double helper5 = (double) i / 5;
        double helper7 = (double) i / 7;
        double helper11 = (double) i / 11;

        if(i/2 == helper2)
            return false;
        else if(i / 3 == helper3)
            return false;
        else if(i / 5 == helper5)
            return false;
        else if(i / 7 == helper7)
            return false;
        else if(i / 11 == helper11)
            return false;

        return true;
    }

    public static void exercise14(double num1, double num2) {
        System.out.println((num1 + num2) / 2);
    }

    public static void exercise14(double num1, double num2, double num3) {
        System.out.println((num1 + num2 + num3) / 3);
    }

    public static void exercise14(double num1, double num2, double num3, double num4) {
        System.out.println((num1 + num2 + num3 + num4) / 4);
    }

    public static void exercise14(double num1, double num2, double num3, double num4, double num5) {
        System.out.println((num1 + num2 + num3 + num4 + num5) / 5);
    }


    public static int exercise15(int i) {
        int sum = 1;
        for (int j = 1; j <= i; j++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int exercise16(int i) {
        if (i != 0)
            return i * exercise16(i - 1);
        else
            return 1;
    }

    public static int exercise17(int i) {
        int j = 0;
        if (j < i) {
            j++;
            return exercise17(j) + exercise17(j + 1);
        } else {
            return 1;
        }


    }


}


enum Month {
    Januari,
    Februari,
    Mars,
    April,
    Maj,
    Juni,
    Juli,
    Augusti,
    September,
    Oktober,
    November,
    December;

    public void daysInMonth(String input) {
        switch (input) {
            case "januari" -> System.out.println(31);
            case "februari" -> System.out.println(28);
            case "mars" -> System.out.println(31);
            case "april" -> System.out.println(30);
            case "maj" -> System.out.println(31);
            case "juni" -> System.out.println(30);
            case "juli" -> System.out.println(31);
            case "augusti" -> System.out.println(31);
            case "september" -> System.out.println(30);
            case "oktober" -> System.out.println(31);
            case "november" -> System.out.println(30);
            case "december" -> System.out.println(31);

        }
    }

}