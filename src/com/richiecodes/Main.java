package com.richiecodes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog(4, 60, "Lucky", "Dog", true, true,
                "Golden Retriever", 5f);
        myDog.setFurColor("Golden");

        Cat myCat = new Cat(4, 30, "Puffy", "Cat", false, true,
                "Striped", false, true);

        List<Animal> animalList = new ArrayList<>();

        Daycare.addAnimal(myDog, animalList);
        Daycare.addAnimal(myCat, animalList);
        Daycare.displayAnimals(animalList);
    }
}
