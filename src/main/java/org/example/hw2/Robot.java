package org.example.hw2;

import java.util.List;

public class Robot implements Actions{
    String model;
    Integer runLength;
    Integer jumpHeight;

    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Робот пробежал");
    }
    @Override
    public void runChampionship() {
        System.out.printf("%s пробежал  %s метров", model, runLength);
    }

    @Override
    public void runChampionship(List<Obstacle> createChampionship) {

    }
}
