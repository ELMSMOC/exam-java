package com.csdb.Zoo.Habitats;

import java.util.ArrayList;
import java.util.List;

import com.csdb.Zoo.Animals.Animal;
import com.csdb.Zoo.Enums.Habitat;

public abstract class HabitatClass {
    private int capacity;

    private Habitat habitat;

    private List<Animal> animalsList = new ArrayList<Animal>();

    public HabitatClass(int capacity, Habitat habitat){
        this.capacity = capacity;
        this.habitat = habitat;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean addAnimal(Animal a){
        for (Animal animal : animalsList) {
            if (!animal.isCompatible(a) && animalsList.size() < this.getCapacity()) {
                return false;
            }
        }
        animalsList.add(a);
        return true;
    }

    @Override
    public String toString() {
        return "HabitatClass [capacity=" + capacity + ", habitat=" + habitat + ", animalsList=" + animalsList + "]";
    }




}
