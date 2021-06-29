package com.richiecodes;

public class Dog extends Animal {
    private String breed, furColor;
    private float snoutLength;

    public Dog(int legs, float size, String name, String type, boolean isFixed, boolean isMammal,
               String breed, float snoutLength) {
        super(legs, size, name, type, isFixed, isMammal);
        this.breed = breed;
        this.snoutLength = snoutLength;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public String speak() {
        return "*BARK*";
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() +
                "\nType: " + this.getType() +
                "\nLegs: " + this.getLegs() +
                "\tSize: " + this.getSize() +
                "cm\nNeutered: " + this.isFixed() +
                "\nMammal: " + this.isMammal() +
                "\nFur Color: " + getFurColor() +
                "\nBreed: " + breed +
                "\nSnout Length: " + snoutLength + "\n");
    }
}
