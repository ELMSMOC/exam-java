package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public abstract class Animal implements IAnimal{

    private int space;
    private Diet diet;
    private String cares;
    private int frequency;
    private Type type;
    private Behavior behavior;
    private boolean isCompatible;
    private Habitat habitat;

    public Animal(int space, Diet diet, String cares, int frequency, Type type, Behavior behavior, boolean isCompatible,
            Habitat habitat) {
        this.space = space;
        this.diet = diet;
        this.cares = cares;
        this.frequency = frequency;
        this.type = type;
        this.behavior = behavior;
        this.isCompatible = isCompatible;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal [space=" + space + ", diet=" + diet + ", cares=" + cares + ", frequency=" + frequency + ", type="
                + type + ", behavior=" + behavior + ", isCompatible=" + isCompatible + ", habitat=" + habitat + "]";
    }





}
