package org.example.hw3.Fruits;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;
        switch (fruit){
            case APPLE -> System.out.println("Это наш фрукт");
            case BANANA, ORANGE, PINEAPPLE -> System.out.println("Это не наш фрукт");
        }
        for (Fruit fruit1: Fruit.values()){
            System.out.println(fruit1);
        }
        System.out.println(Fruit.valueOf("APPLE"));
    }
}
