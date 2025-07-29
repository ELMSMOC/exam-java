package com.csdb.Zoo.Enums;

public enum Behavior {
    PREDATOR("Depredador"),
    PREY("Presa");

    String trans;

    Behavior(String trans){
        this.trans = trans;
    }
}
