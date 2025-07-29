package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public class Seal extends Animal {


    public Seal() {
        super(25, Diet.CARNIVOROUS, "Medicinas", 6, Type.SEA, Behavior.PREY, true, Habitat.AQUATIC, true);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREY;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

}
