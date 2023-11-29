package com.ing.zoo;

public class Lion extends AbstractAnimal implements MeatEater{


    private String trick;

    public Lion(String name) {
        super(name);
        this.helloText = "roooaoaaaaar";
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
