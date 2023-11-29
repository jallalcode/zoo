package com.ing.zoo.animals;

import com.ing.zoo.base.AbstractAnimal;
import com.ing.zoo.base.PlantEater;

public class Capybara extends AbstractAnimal implements PlantEater {
    private String trick;

    public Capybara (String name) {
        super(name);
        this.helloText = "boink";
    }

    @Override
    public void eatLeaves() {
        eatText = "hmm nomnomnom";
        printText(name, eatText);
    }

    @Override
    public void performTrick() {
        trick = "Casually riding an alligator";
        printText(name, trick);
    }

}
