package com.csdb.Zoo;

import java.util.List;

import com.csdb.Zoo.Habitats.IHabitat;

public interface IZoo {
    void addHabitat (IHabitat h);
    List<IHabitat> removeHabitat (IHabitat h);
}
