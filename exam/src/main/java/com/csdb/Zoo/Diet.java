package com.csdb.Zoo;

public enum Diet {
    CARNIVOROUS("Carnivoro"),
    OMNIVORE("Omnivoro"),
    HERBIVOROUS("Herbivoro");

    String trans;

    Diet(String trans){
        this.trans = trans;
    }
}
