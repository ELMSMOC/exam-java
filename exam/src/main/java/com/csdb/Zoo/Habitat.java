package com.csdb.Zoo;

public enum Habitat {
    TERRESTRIAL("Terrestre", 4),
    AQUATIC("Acuatico", 5),
    TERRARIUM("Terrario", 6);

    String trans;
    int animalsFit;

    Habitat(String trans, int animalsFit){
        this.trans = trans;
        this.animalsFit = animalsFit;
    }

}
