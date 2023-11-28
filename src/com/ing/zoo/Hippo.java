package com.ing.zoo;

public class Hippo implements PlantEater {
    private String name;
    private String helloText;
    private String eatText;

    public Hippo(String name) {
        this.name = name;
    }

    public void sayHello() {
        helloText = "splash";
        printText(name, helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch lovely";
        printText(name, eatText);
    }
}
