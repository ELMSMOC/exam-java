package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitatenum;
import com.csdb.Zoo.Enums.Type;

public class Toucan extends Animal {


    public Toucan() {
        super("Tucan",25, Diet.HERBIVOROUS, "Medicinas", 6, Type.BIRD, Behavior.PREY, true, Habitatenum.TERRESTRIAL, true);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREY;
    }

    @Override
    public Habitatenum getHabitat() {
        return Habitatenum.TERRESTRIAL;
    }

}
