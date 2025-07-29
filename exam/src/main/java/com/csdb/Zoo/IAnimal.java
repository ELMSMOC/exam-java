package com.csdb.Zoo;

public interface IAnimal {
    Behavior getBehavior();
    Habitat getHabitat();
    boolean isCompatible(Animal a);


}
