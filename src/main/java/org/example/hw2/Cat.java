package org.example.hw2;

import java.util.List;

public class Cat implements Actions {
    String name;
    Integer runLength;
    Integer jumpHeight;

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал");
    }
    @Override
    public void runChampionship() {
        System.out.printf("%s пробежал  %s метров", name, runLength);
    }

    @Override
    public void runChampionship(List<Obstacle> createChampionship) {

    }
}
