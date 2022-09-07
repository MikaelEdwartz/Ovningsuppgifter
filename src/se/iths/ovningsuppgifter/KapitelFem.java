package se.iths.ovningsuppgifter;

public class KapitelFem {

    public static void main(String[] args) {

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


}
