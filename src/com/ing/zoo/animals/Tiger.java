package com.ing.zoo.animals;

import com.ing.zoo.base.AbstractAnimal;
import com.ing.zoo.base.MeatEater;

import java.util.Random;

public class Tiger extends AbstractAnimal implements MeatEater {

    private String trick;

    public Tiger(String name) {
        super(name);
        this.helloText = "rraaarww";
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        printText(name, eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        printText(name, trick);
    }
}
