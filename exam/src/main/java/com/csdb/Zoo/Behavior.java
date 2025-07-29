package com.csdb.Zoo;

public enum Behavior {
    PREDATOR("Depredador"),
    HUNT("Presa");

    String trans;

    Behavior(String trans){
        this.trans = trans;
    }
}
