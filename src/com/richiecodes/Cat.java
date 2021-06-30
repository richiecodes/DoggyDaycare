package com.richiecodes;

public class Cat extends Animal {
    String pattern;
    boolean wasStray, isOutdoorCat;
    String noise = "";

    public Cat(int legs, int size, String name, String type, boolean isFixed, boolean isMammal,
               String pattern, boolean wasStray, boolean isOutdoorCat) {
        super(legs, size, name, type, isFixed, isMammal);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.isOutdoorCat = isOutdoorCat;
    }

    public Cat(int legs, int size, String name, String type, boolean isFixed, boolean isMammal,
               String pattern, boolean wasStray, boolean isOutdoorCat, String noise) {
        super(legs, size, name, type, isFixed, isMammal);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.isOutdoorCat = isOutdoorCat;
        this.noise = noise;
    }

    @Override
    public String speak() {
        if (!noise.equals("")) {
            return super.speak();
        } else {
            return noise;
        }
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() +
                "\nType: " + this.getType() +
                "\nLegs: " + this.getLegs() +
                "\tSize: " + this.getSize() +
                "cm\nNeutered: " + this.getIsFixed() +
                "\nMammal: " + this.getIsMammal() +
                "\nPattern: " + pattern +
                "\nOutdoor: " + isOutdoorCat + "\n");
    }
}
