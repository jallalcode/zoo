package com.ing.zoo.animals;

import com.ing.zoo.base.AbstractAnimal;
import com.ing.zoo.base.MeatEater;

public class Platypus extends AbstractAnimal implements MeatEater {
    private String trick;

    public Platypus(String name) {
        super(name);
        this.helloText = "PURRRR";
    }

    @Override
    public void printText(String name, String text) {
        super.printText(name, text);
    }

    @Override
    public void eatMeat() {
        eatText = "shlurpp";
        printText(name, eatText);
    }

    @Override
    public void performTrick() {
        trick = "Saving the world against bad guys";
        printText(name, trick);
    }
}
