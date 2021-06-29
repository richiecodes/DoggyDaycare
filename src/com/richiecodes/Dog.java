package com.richiecodes;

public class Dog extends Animal {
    private String breed, furColor;
    private float snoutLength;

    public Dog(int legs, float size, String name, String type, boolean isFixed, boolean isMammal,
               String breed, float snoutLength, String furColor) {
        super(legs, size, name, type, isFixed, isMammal);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.furColor = furColor;
    }

    public String getFurColor() {
        if(furColor != null) {
            return furColor;
        } else {
            return "N/A";
        }
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
                "cm\nNeutered: " + this.getIsFixed() +
                "\nMammal: " + this.getIsMammal() +
                "\nFur Color: " + getFurColor() +
                "\nBreed: " + breed +
                "\nSnout Length: " + snoutLength + "cm\n");
    }
}
