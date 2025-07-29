package com.csdb;

import com.csdb.Zoo.Animals.Seal;
import com.csdb.Zoo.Animals.Toucan;
import com.csdb.Zoo.Animals.Zebra;
import com.csdb.Zoo.Enums.Habitat;
import com.csdb.Zoo.Habitats.HabitatClass;
import com.csdb.Zoo.Habitats.Terrestrial;
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
        Toucan c = new Toucan();

        Terrestrial t1 = new Terrestrial();

        System.out.println(t1.addAnimal(c));

        System.out.println(t1.toString());
        System.out.println(c.isCompatible(l));



        // System.out.println(l.toString());
    }
}
