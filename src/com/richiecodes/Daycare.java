package com.richiecodes;

import java.util.List;

public class Daycare {

    public static void addAnimal(List<Animal> animalList, Animal animal) {
        animalList.add(animal);
    }

    public static void displayAnimals(List<Animal> animalList) {
        for(var a : animalList) {
            System.out.println(a + a.speak() + "\n");
        }
    }

    public static void removeAnimal(String name, List<Animal> animalList) {
        for(var a : animalList) {
            if(a.getName().equalsIgnoreCase(name)) {
                System.out.println("Removed \"" + a.getName() + "\" from the Daycare\n");
                animalList.remove(a);
            } else {
                throw new IllegalArgumentException("Error: Animal name \"" + name + "\" cannot be" +
                        " found in list");
            }
        }
    }
}
