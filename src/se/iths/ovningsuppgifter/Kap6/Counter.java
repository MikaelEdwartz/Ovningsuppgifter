package se.iths.ovningsuppgifter.Kap6;

public class Counter {
    private int count;
    private int counterObjects;

    public Counter(){
        this.count = 0;
        this.counterObjects++;
    }
    public void increase(){
        this.count++;

    }

    public void decrease(){
        this.count--;
    }
    public String toString(){
        return "Värdet är " + this.count + " och det har skapats " + this.counterObjects + " st objekt.";
    }

}
