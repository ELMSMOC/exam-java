package com.csdb.Zoo;

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





}
