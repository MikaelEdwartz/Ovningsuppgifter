package se.iths.ovningsuppgifter.Kap6;

public class Pancakes {

    private int flour;
    private int milk;
    private int egg;
    private int salt;
    private int butter;

    public Pancakes(){
     this.flour = 5;
     this.milk = 5;
     this.egg = 5;
     this.salt = 5;
     this.butter = 5;
    }

    public void makePancakes(){
        if(canMakePancakes()){
            decreaseIngredients();
            System.out.println("Din pannkaka lagas!!!");
        }
    }

    public boolean canMakePancakes(){
        if(this.flour > 0 && this.milk > 0 && this.egg > 0 && this.salt > 0 && this.butter > 0)
            return true;
        return false;
    }

    public void decreaseIngredients(){
        this.flour--;
        this.milk--;
        this.egg--;
        this.salt--;
        this.butter--;

    }



}


/*
12 Skapa en metod med namnet makePancakes.
När man anropar den ska den minska ingredienserna med motsvarande en sats pannkakor och skriva ut på konsolen att pannkakan lagas.
Om det inte finns tillräckligt för en sats så ska det skrivas ut på konsolen. Upprepa så länge det finns tillräckligt med ingredienser.
Skapa nya funktioner om du behöver. Uppgiften går att lösa med en rekursiv funktion.
*/