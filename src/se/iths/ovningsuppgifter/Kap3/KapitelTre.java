package se.iths.ovningsuppgifter.Kap3;

import java.util.Scanner;

public class KapitelTre {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double convert = 0;
        try {
        convert = Double.parseDouble(scanner.nextLine());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(convert);
    }




}


