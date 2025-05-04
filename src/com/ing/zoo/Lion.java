package com.ing.zoo;

import Interfaces.Animal;
import Interfaces.Carnivore;

public class Lion implements Animal, Carnivore {
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
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}