package com.ing.zoo;

import java.util.Random;

public class Pig extends AbstractAnimal implements MeatEater, PlantEater {

    private String trick;

    public Pig(String name) {
        super(name);
        this.helloText = "splash";
    }

    public void eatLeaves() {
        eatText = "munch munch oink";
        printText(name, eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        printText(name, eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        printText(name, trick);
    }
}
