package se.iths.ovningsuppgifter.Kap7.Animals;

public class Cat extends Mammal{

    public Cat() {

    }

    @Override
    public void speak() {
        System.out.println("mjau");
        super.speak();
    }
}




