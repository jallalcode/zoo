package com.ing.zoo.animals;

import com.ing.zoo.base.AbstractAnimal;
import com.ing.zoo.base.PlantEater;

public class Zebra extends AbstractAnimal implements PlantEater {


    private String trick;

    public Zebra(String name) {
        super(name);
        this.helloText = "zebra zebra";
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        printText(name, eatText);
    }

    @Override
    public void performTrick() {
        trick = "Does a backflip";
        printText(name, trick);
    }


}
