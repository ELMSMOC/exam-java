package com.csdb.Zoo;

public class Elephant extends Animal {


    public Elephant() {
        super(25, Diet.HERBIVOROUS, "Medicinas", 6, Type.MAMMAL, Behavior.HUNT, true, Habitat.TERRESTRIAL);
    }

    @Override
    public boolean isCompatible(Animal a) {
        if (a.getBehavior() == this.getBehavior() && a.getHabitat() == this.getHabitat()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Behavior getBehavior() {
        return Behavior.PREDATOR;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

}
