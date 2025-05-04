package com.ing.zoo;

import Interfaces.Animal;
import Interfaces.Herbivore;

public class Sloth implements Animal, Herbivore {
    public String name;
    public String eatText;
    public String helloText;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void sayHello(){
        helloText = "heeeeeelllllooooooo";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves(){
        eatText = "munch munch thaaaaaannnnkksss brooooooo";
        System.out.println(eatText);
    }
}