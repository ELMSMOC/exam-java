package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public class Elephant extends Animal {


    public Elephant() {
        super(25, Diet.HERBIVOROUS, "Medicinas", 6, Type.MAMMAL, Behavior.PREY, true, Habitat.TERRESTRIAL, true);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREY;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

}
