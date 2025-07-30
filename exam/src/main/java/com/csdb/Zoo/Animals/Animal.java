package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitatenum;
import com.csdb.Zoo.Enums.Type;

public abstract class Animal implements IAnimal{

    private String specie;
    private int space;
    private Diet diet;
    private String cares;
    private int frequency;
    private Type type;
    private Behavior behavior;
    private boolean isCompatible;
    private boolean isSociable;
    private Habitatenum habitat;

    public Animal(String specie, int space, Diet diet, String cares, int frequency, Type type, Behavior behavior, boolean isCompatible, Habitatenum habitat, boolean isSociable) {
        this.specie = specie;
        this.space = space;
        this.diet = diet;
        this.cares = cares;
        this.frequency = frequency;
        this.type = type;
        this.behavior = behavior;
        this.isCompatible = isCompatible;
        this.habitat = habitat;
        this.isSociable = isSociable;
    }

    @Override
    public boolean isCompatible(Animal a) {
        if (a.getBehavior() == this.getBehavior() && a.getHabitat() == this.getHabitat() && a.getIsSociable() && this.getIsSociable()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Animal: " + this.specie + " Space needed=" + space + ", diet=" + diet + ", cares=" + cares + ", frequency=" + frequency + ", type="
                + type + ", behavior=" + behavior + ", isCompatible=" + isCompatible + ", habitat=" + habitat + "\n";
    }

    @Override
    public boolean getIsSociable() {
        return true;
    }





}
