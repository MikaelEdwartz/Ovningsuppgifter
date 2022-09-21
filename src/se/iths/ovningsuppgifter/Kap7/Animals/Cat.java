package se.iths.ovningsuppgifter.Kap7.Animals;

import se.iths.ovningsuppgifter.Kap7.Interface.NoiseMaker;

public class Cat extends Mammal implements NoiseMaker {

    public Cat() {

    }

    @Override
    public void speak() {
        System.out.println("mjau");
        super.speak();
    }

    @Override
    public void makeNoise() {
        System.out.println("Mjau");
    }
}




