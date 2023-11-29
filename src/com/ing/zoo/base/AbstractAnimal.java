package com.ing.zoo.base;

// Abstract class is made so name, hellotext and eattext don't have to be instantiated in every animal class
public abstract class AbstractAnimal implements Animal {
    protected String name;
    protected String helloText;
    protected String eatText;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    //Moved this method to this abstract method because all animals have a sayHello method
    @Override
    public void sayHello() {
        printText(name, helloText);
    }

    public String getName() {
        return name;
    }
}
