package com.ing.zoo;

import Interfaces.Animal;
import Interfaces.Carnivore;
import Interfaces.Herbivore;
import Interfaces.TrickPerformer;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Animal[] animals = new Animal[]{
                new Lion() {{name = "henk";}},
                new Hippo() {{name = "elsa";}},
                new Pig() {{name = "dora";}},
                new Tiger() {{name="wally";}},
                new Zebra() {{name="marty";}},
                new Elephant() {{name="debby";}},
                new Sloth() {{name="flash";}}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().toLowerCase();

        if(input.startsWith(commands[0]))
        {
            if(input.equals(commands[0]))
            {
                for(Animal a : animals)
                {
                    a.sayHello();
                }
            } else
            {
                String animalName = input.substring(6);
                for(Animal a : animals)
                {
                    if(a.getName().equals(animalName))
                    {
                        a.sayHello();
                        return;
                    }
                }
                System.out.println("We don't have this animal in this zoo \uD83D\uDE2D");
            }
        } else if(input.equals(commands[1]))
        {
            for(Animal a : animals)
            {
                if(a instanceof Herbivore)
                {
                    ((Herbivore) a).eatLeaves();
                }
            }
        } else if(input.equals(commands[2]))
        {
            for(Animal a : animals)
            {
                if(a instanceof Carnivore)
                {
                    ((Carnivore) a).eatMeat();
                }
            }
        } else if(input.equals(commands[3]))
        {
            for(Animal a : animals)
            {
                if(a instanceof TrickPerformer)
                {
                    ((TrickPerformer) a).performTrick();
                }
            }
        } else
        {
            System.out.println("Unknown command");
        }
    }
}