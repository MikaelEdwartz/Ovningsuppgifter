package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

import se.iths.ovningsuppgifter.Kap7.Vehicles.Boat;

public class Main {
    public static void main(String[] args) {

        Buyer buyer = new Buyer("doj", "ekonom", 10, 1000000);
        Bil bil = new Bil(100, 200, buyer);

    }
}
