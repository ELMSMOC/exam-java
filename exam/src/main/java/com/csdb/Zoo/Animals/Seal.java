package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitatenum;
import com.csdb.Zoo.Enums.Type;

public class Seal extends Animal {


    public Seal() {
        super("Foca",25, Diet.CARNIVOROUS, "Medicinas", 6, Type.SEA, Behavior.PREY, true, Habitatenum.AQUATIC, true);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREY;
    }

    @Override
    public Habitatenum getHabitat() {
        return Habitatenum.AQUATIC;
    }

}
