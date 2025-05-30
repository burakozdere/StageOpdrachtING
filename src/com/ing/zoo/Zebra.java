package com.ing.zoo;

import Interfaces.Animal;
import Interfaces.Herbivore;

public class Zebra implements Animal, Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}