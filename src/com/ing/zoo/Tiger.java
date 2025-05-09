package com.ing.zoo;

import Interfaces.Animal;
import Interfaces.Carnivore;
import Interfaces.TrickPerformer;

import java.util.Random;

public class Tiger implements Animal, Carnivore, TrickPerformer {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom wubalubadubdub";
        System.out.println(eatText);
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
        System.out.println(trick);
    }
}