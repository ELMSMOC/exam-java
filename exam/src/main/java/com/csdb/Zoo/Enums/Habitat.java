package com.csdb.Zoo.Enums;

public enum Habitat {
    TERRESTRIAL("Terrestre"),
    AQUATIC("Acuatico"),
    TERRARIUM("Terrario");


    String trans;

    Habitat(String trans){
        this.trans = trans;
    }

}
