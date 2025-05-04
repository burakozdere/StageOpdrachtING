package com.ing.zoo;

import Interfaces.Animal;
import Interfaces.Herbivore;

public class Hippo implements Animal, Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "Moto Moto likes leaves *munch*";
        System.out.println(eatText);
    }
}