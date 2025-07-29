package com.csdb.Zoo;

public class Lion extends Animal {


    public Lion() {
        super(20, Diet.CARNIVOROUS, "Medicinas", 4, Type.MAMMAL, Behavior.PREDATOR, true, Habitat.TERRESTRIAL);
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
