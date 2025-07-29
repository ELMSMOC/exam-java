package com.csdb.Zoo.Enums;

public enum Diet {
    CARNIVOROUS("Carnivoro"),
    OMNIVORE("Omnivoro"),
    HERBIVOROUS("Herbivoro");

    String trans;

    Diet(String trans){
        this.trans = trans;
    }
}
