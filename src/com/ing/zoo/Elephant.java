package com.ing.zoo;

import Interfaces.Animal;
import Interfaces.Herbivore;
import Interfaces.TrickPerformer;

import java.util.Random;

public class Elephant implements Animal, Herbivore, TrickPerformer {
    public String name;
    public String eatText;
    public String helloText;
    public String trick;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void sayHello(){
        helloText = "toooot";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves(){
        eatText = "crunch crunch *trumpet noises*";
        System.out.println(eatText);
    }

    @Override
    public void performTrick(){
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0) {
            trick = "balances a ball on her trunk";
        } else {
            trick = "balances on 1 foot";
        }
        System.out.println(trick);
    }
}