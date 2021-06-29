package com.richiecodes;

public class Animal {
    private String name, type;
    private boolean isFixed, isMammal;
    private int legs;
    private float size;

    public Animal(int legs, float size, String name, String type, boolean isFixed, boolean isMammal) {
        this.legs = legs;
        this.size = size;
        this.name = name;
        this.type = type;
        this.isFixed = isFixed;
        this.isMammal = isMammal;
    }

    public String getType() {
        return type;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public int getLegs() {
        return legs;
    }

    public float getSize() {
        return size;
    }

    public String speak() {
        return "(---)";
    }

    @Override
    public String toString() {
        return ("Name: " + name +
        "\nType: " + type +
        "\nLegs: " + legs +
        "\tSize: " + size +
        "cm\nNeutered: " + isFixed +
        "\nMammal: " + isMammal + "\n");
    }

    public String getName() {
        return name;
    }
}
