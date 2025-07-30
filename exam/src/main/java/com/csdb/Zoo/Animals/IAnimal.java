package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Habitatenum;

public interface IAnimal {
    Behavior getBehavior();
    Habitatenum getHabitat();
    boolean getIsSociable();
    boolean isCompatible(Animal a);


}
