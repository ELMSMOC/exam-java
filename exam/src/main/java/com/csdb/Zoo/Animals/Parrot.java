package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitatenum;
import com.csdb.Zoo.Enums.Type;

public class Parrot extends Animal {


    public Parrot() {
        super("Loro",25, Diet.OMNIVORE, "Medicinas", 6, Type.BIRD, Behavior.PREY, true, Habitatenum.TERRESTRIAL, true);
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
