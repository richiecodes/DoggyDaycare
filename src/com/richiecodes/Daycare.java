package com.richiecodes;

import java.util.List;

public class Daycare {

    public static void addAnimal(Animal animal, List<Animal> animalList) {
        animalList.add(animal);
    }

    public static void displayAnimals(List<Animal> animalList) {
        for(var a : animalList) {
            System.out.println(a + a.speak() + "\n");
        }
    }

    public static void removeAnimal(String name, List<Animal> animalList) {
        for(var a : animalList) {
            if(a.getName().equals(name)) {
                animalList.remove(a);
            } else {
                throw new IllegalArgumentException("Error: Animal name (" + name + ") cannot be" +
                        " found in list");
            }
        }
    }
}
