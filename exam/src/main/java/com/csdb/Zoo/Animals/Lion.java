package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public class Lion extends Animal {


    public Lion() {
        super("Leon", 20, Diet.CARNIVOROUS, "Medicinas", 4, Type.MAMMAL, Behavior.PREDATOR, true, Habitat.TERRESTRIAL, true);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREDATOR;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

}
