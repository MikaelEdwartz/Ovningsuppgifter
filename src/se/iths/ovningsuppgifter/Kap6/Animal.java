package se.iths.ovningsuppgifter.Kap6;

public class Animal {
    String animal;
    String name;
    int age;

    public Animal(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;

    }

    public String toString() {
        return name + " är en " + animal + " och är " + age + " år gammal.";

    }
}
