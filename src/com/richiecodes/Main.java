package com.richiecodes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        Daycare.addAnimal(animalList, new Dog(4, 60, "Lucky", "Dog", true, true,
                "Golden Retriever", 5f, "Golden"));
        Daycare.addAnimal(animalList, new Cat(4, 30, "Puffy", "Cat", false, true,
                "Striped", false, true));

        Daycare.displayAnimals(animalList);

        Daycare.removeAnimal("lucky", animalList);

        Daycare.displayAnimals(animalList);

        // Throws error
//        Daycare.removeAnimal("test", animalList);
    }
}
