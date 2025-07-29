package com.csdb.Zoo.Habitats;

import java.util.ArrayList;
import java.util.List;

import com.csdb.Zoo.Animals.Animal;
import com.csdb.Zoo.Enums.Habitat;

public abstract class HabitatClass {
    private int capacity;
    private Habitat habitat;

    private List<Animal> animalsList = new ArrayList<Animal>();

    HabitatClass(int capacity, Habitat habitat){
        this.capacity = capacity;
        this.habitat = habitat;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    boolean addAnimal(Animal a){
        for (Animal animal : animalsList) {
            if (!animal.isCompatible(a)) {
                return false;
            }
        }
        animalsList.add(a);
        return true;
    }



}
