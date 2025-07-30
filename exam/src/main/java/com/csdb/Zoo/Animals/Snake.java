package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitatenum;
import com.csdb.Zoo.Enums.Type;

public class Snake extends Animal {


    public Snake() {
        super("Serpiente",25, Diet.OMNIVORE, "Medicinas", 6, Type.REPTILE, Behavior.PREDATOR, true, Habitatenum.TERRARIUM, false);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREDATOR;
    }

    @Override
    public Habitatenum getHabitat() {
        return Habitatenum.TERRARIUM;
    }

    @Override
    public boolean getIsSociable() {
        return false;
    }

}
