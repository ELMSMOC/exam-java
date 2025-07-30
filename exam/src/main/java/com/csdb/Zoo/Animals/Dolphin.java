package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitatenum;
import com.csdb.Zoo.Enums.Type;

public class Dolphin extends Animal {


    public Dolphin() {
        super( "Delfin",25, Diet.CARNIVOROUS, "Medicinas", 6, Type.SEA, Behavior.PREDATOR, true, Habitatenum.AQUATIC, true);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREDATOR;
    }

    @Override
    public Habitatenum getHabitat() {
        return Habitatenum.AQUATIC;
    }

}
