package com.epam.OOP;


public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
        System.err.println("This animal is mostly blue. It has 2 paws and no fur." +
                " Moreover, it has 2 wings and can fly.");
    }

    @Override
    public void getDescription(){
        System.out.println("This animal is mostly blue. It has 2 paws and no fur." +
                " Moreover, it has 2 wings and can fly.");
    }
}
