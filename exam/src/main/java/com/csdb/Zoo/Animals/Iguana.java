package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public class Iguana extends Animal {


    public Iguana() {
        super(25, Diet.HERBIVOROUS, "Medicinas", 6, Type.REPTILE, Behavior.PREY, true, Habitat.TERRARIUM, false);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREY;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRARIUM;
    }

    @Override
    public boolean getIsSociable() {
        return false;
    }

}
