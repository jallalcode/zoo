package com.ing.zoo;

public class Lion implements MeatEater{

    // Change fields to private
    private final String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        printText(name, helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        printText(name, eatText);
    }

    @Override
    public void performTrick() {
        trick = "Long live the king!!";
        printText(name, trick);
    }

}
