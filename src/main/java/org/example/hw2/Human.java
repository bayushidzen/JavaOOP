package org.example.hw2;

import java.util.List;

import static org.example.hw2.Championship.createChampionship;

public class Human implements Actions{
    String name;
    Integer runLength;
    Integer jumpHeight;

    public Human() {
        this.name = "Хуманс";
        this.runLength = 0;
        this.jumpHeight = 0;
    }

    public Human(String name, Integer runLength, Integer jumpHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.printf("%s прыгнул на %s метров %n", name, jumpHeight);
    }

    @Override
    public void run() {
        System.out.printf("%s пробежал  %s метров %n", name, runLength);
    }

    @Override
    public void runChampionship() {

    }

    @Override
    public void runChampionship(List<Obstacle> createChampionship) {
        for(int i=0; i <createChampionship.size();i++)
            if(createChampionship.get(i) instanceof Barrier) {
                System.out.println(createChampionship.get(i));
                jump();}
            else {System.out.println(createChampionship.get(i)); run();}
    }
}
