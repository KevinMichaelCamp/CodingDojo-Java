package com.codingdojo.zoo;
import com.codingdojo.zoo.Mammal;

public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("Gorilla has thown a banana!");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla is eating bananas...");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla is climbing a tree...");
        energyLevel -= 10;
    }
}
