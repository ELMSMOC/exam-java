package com.csdb.Zoo.Enums;

public enum Type {
    MAMMAL("Mamifero"),
    BIRD("Aves"),
    REPTILE("Reptil"),
    SEA("Animal acuatico");

    String trans;
    Type(String trans) {
        this.trans = trans;
    }
}
