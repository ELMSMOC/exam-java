package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Habitat;

public interface IAnimal {
    Behavior getBehavior();
    Habitat getHabitat();
    boolean getIsSociable();
    boolean isCompatible(Animal a);


}
