package com.csdb.Zoo.Animals;

import com.csdb.Zoo.Enums.Behavior;
import com.csdb.Zoo.Enums.Diet;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Enums.Type;

public class Snake extends Animal {


    public Snake() {
        super("Serpiente",25, Diet.OMNIVORE, "Medicinas", 6, Type.REPTILE, Behavior.PREDATOR, true, Habitat.TERRARIUM, false);
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREDATOR;
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
