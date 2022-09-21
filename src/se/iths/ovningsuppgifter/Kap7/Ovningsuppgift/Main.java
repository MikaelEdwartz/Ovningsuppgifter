package se.iths.ovningsuppgifter.Kap7.Ovningsuppgift;

import se.iths.ovningsuppgifter.Kap7.Vehicles.Boat;

public class Main {
    public static void main(String[] args) {

        Buyer buyer1 = new Buyer("doj", "ekonom", 10, 1000000);
        Buyer buyer2 = new Buyer("doj2", "ekonom", 10, 1000000);
        Buyer buyer3 = new Buyer("doj3", "ekonom", 10, 1000000);
        Seller seller1 = new Seller("doj4", "monoke", 100, 10000);
        Seller seller2 = new Seller("doj5", "monoke", 100, 10000);
        VehicleDealer dealer = new VehicleDealer("dys", "dealer", 100, 1030);

        Airplane plane = new Airplane(1000,2304, seller1);
        Helicopter copter = new Helicopter(1000, 3020, seller1);
        Bil bil = new Bil(100, 2310, seller2);

        System.out.println(dealer.changeOwner(plane, seller1, buyer1));
        System.out.println(dealer.changeOwner(copter, seller1, buyer2));
        System.out.println(dealer.changeOwner(copter, seller1, buyer2));
        System.out.println(dealer.changeOwner(bil, seller2, buyer3));



    }
}

/*Uppgift 5 Skapa upp 3 köpare och 2 säljare och 1 fordonshandlare.
Skapa upp ett flygplan, en helikopter och en bil.
1 säljare ska äga flygplanet och helikoptern medan bilen ska ägas av den andre.
Låt nu köparna köpa varsitt fordon. Skriv ut transaktionerna på skärmen
 */
