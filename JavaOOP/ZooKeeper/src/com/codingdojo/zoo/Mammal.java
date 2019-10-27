package com.codingdojo.zoo;

public class Mammal {
    protected int energyLevel = 100;

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
}
