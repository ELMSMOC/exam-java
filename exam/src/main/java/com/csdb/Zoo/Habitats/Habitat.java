package com.csdb.Zoo.Habitats;

import java.util.ArrayList;
import java.util.List;

import com.csdb.Zoo.Animals.Animal;
import com.csdb.Zoo.Enums.Habitatenum;
import com.csdb.Zoo.Exceptions.ZooException;

public abstract class Habitat implements IHabitat{
    private int capacity;

    private Habitatenum habitat;

    private List<Animal> animalsList = new ArrayList<Animal>();

    public Habitat(int capacity, Habitatenum habitat){
        this.capacity = capacity;
        this.habitat = habitat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addAnimal(Animal a) {
        try {
            if(animalsList.size() < this.getCapacity()){
                throw new ZooException("No caben los animales");
            }


            for (Animal animal : animalsList) {
                if (!animal.isCompatible(a)) {
                    throw new ZooException("No es compatible");
                }
            }
            animalsList.add(a);

        } catch (Exception e) {
            System.err.println("No se ha podido añadir");
        }
    }

    @Override
    public String toString() {
        return "HabitatClass [capacity=" + capacity + ", habitat=" + habitat + ", animalsList=" + animalsList + "]";
    }




}
