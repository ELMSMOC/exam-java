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




        Dolphin d1 = new Dolphin();

        Terrestrial t1 = new Terrestrial();
        t1.addAnimal(new Elephant());
        t1.addAnimal(new Zebra());
        t1.addAnimal(new Zebra());
        t1.addAnimal(new Elephant());
        t1.addAnimal(new Toucan());
        t1.addAnimal(new Toucan());
        t1.addAnimal(new Toucan());
        t1.addAnimal(new Toucan());
        t1.addAnimal(new Toucan());

        System.out.println(t1.toString());



        // System.out.println(l.toString());
    }
}
