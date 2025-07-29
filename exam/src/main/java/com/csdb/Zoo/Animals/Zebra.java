package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public class Zebra extends Animal {


    public Zebra() {
        super("Zebra", 20, Diet.HERBIVOROUS, "Medicinas", 3, Type.MAMMAL, Behavior.PREY, true, Habitat.TERRESTRIAL, true);
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
