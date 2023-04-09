package org.example.hw2;

public class Human extends Entity {

    public Human() {
    }

    @Override
    public void run() {
        System.out.println(" мявк ! мявк!");
    }

    @Override
    public void jump() {
        System.out.println("прыжек кота! ");
    }
}
