package com.ing.zoo;

import java.util.Random;

public class Zebra implements PlantEater{

    private final String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Zebra(String name) {
        this.name = name;
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        printText(name, helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        printText(name, eatText);
    }

    @Override
    public void performTrick() {
        trick = "Does a backflip";
        printText(name, trick);
    }


}
