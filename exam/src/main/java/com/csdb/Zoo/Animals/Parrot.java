package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public class Parrot extends Animal {


    public Parrot() {
        super("Loro",25, Diet.OMNIVORE, "Medicinas", 6, Type.BIRD, Behavior.PREY, true, Habitat.TERRESTRIAL, true);
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
