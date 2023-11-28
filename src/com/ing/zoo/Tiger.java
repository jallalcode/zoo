package com.ing.zoo;

import java.util.Random;

public class Tiger implements MeatEater{
    private final String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void sayHello()
    {
        helloText = "rraaarww";
        printText(name, helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        printText(name, eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        printText(name, trick);
    }
}
