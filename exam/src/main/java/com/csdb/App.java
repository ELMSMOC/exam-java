package com.csdb;

import com.csdb.Zoo.Animals.Seal;
import com.csdb.Zoo.Animals.Toucan;
import com.csdb.Zoo.Animals.Zebra;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Habitats.HabitatClass;
import com.csdb.Zoo.Habitats.Terrestrial;
import com.csdb.Zoo.Animals.Dolphin;
import com.csdb.Zoo.Animals.Elephant;
import com.csdb.Zoo.Animals.Lion;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Elephant l = new Elephant();
        Toucan t = new Toucan();
        Toucan t2 = new Toucan();
        Toucan t3 = new Toucan();
        Zebra z = new Zebra();
        Dolphin d1 = new Dolphin();

        Terrestrial t1 = new Terrestrial();

        System.out.println(t1.addAnimal(t));
        System.out.println(t1.addAnimal(t2));
        System.out.println(t1.addAnimal(d1));
        System.out.println(t1.addAnimal(z));

        System.out.println(t1.toString());
        System.out.println(t.isCompatible(d1));



        // System.out.println(l.toString());
    }
}
