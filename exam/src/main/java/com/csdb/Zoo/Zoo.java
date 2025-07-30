package com.csdb.Zoo;

import java.util.ArrayList;
import java.util.List;

import com.csdb.Zoo.Habitats.Habitat;
import com.csdb.Zoo.Habitats.IHabitat;

public class Zoo implements IZoo{

    List<IHabitat> habitatList = new ArrayList<IHabitat>();

    @Override
    public void addHabitat(IHabitat h) {
        this.habitatList.add(h);
    }

    @Override
    public List<IHabitat> removeHabitat(IHabitat h) {
        this.habitatList.remove(h);

        return habitatList;
    }

}
