package com.ing.zoo;

public class Hippo extends AbstractAnimal implements PlantEater {


    public Hippo(String name) {
        super(name);
        this.helloText = "splash";
    }

    public void eatLeaves() {
        eatText = "munch munch lovely";
        printText(name, eatText);
    }
}
