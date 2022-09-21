package se.iths.ovningsuppgifter.Kap7.Animals;

import se.iths.ovningsuppgifter.Kap7.Interface.NoiseMaker;

public class Bird extends  Animal implements NoiseMaker {


    @Override
    public void makeNoise() {
        System.out.println("tweet");
    }
}
