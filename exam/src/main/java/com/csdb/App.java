package com.csdb;

import com.csdb.Zoo.Animals.Seal;
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
        System.out.println("Hello World!");

        Lion l = new Lion();
        Seal e = new Seal();

        // System.out.println(e.isCompatible(l));



        // System.out.println(l.toString());
    }
}
