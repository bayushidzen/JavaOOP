package org.example.hw1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Milk vkusnoteevo = new Milk("Вкуснотеево", 10);
        Milk domik = new Milk("Домик в Деревне", 10);
        Milk prostokvashino = new Milk("Простоквашино", 10);

        Bread baton = new Bread("Батон", 10);
        Bread selskiy = new Bread("Сельский", 10);
        Bread toast = new Bread("Тостовый", 10);

        Vegetables potato = new Vegetables("Картофель", 10);
        Vegetables tomato = new Vegetables("Томаты", 10);
        Vegetables cucumber = new Vegetables("Огурцы элитные", 10);

        User vasya = new User("vasya", "super", new Basket());
        User petya = new User("petya", "super", new Basket());
        User masha = new User("masha", "super", new Basket());

        vasya.userBasket.AddToBasket(potato.getName(),3);
        potato.setCount(potato.getCount() - vasya.userBasket.getCountInBasket());
        vasya.userBasket.AddToBasket(domik.getName(),2);
        domik.setCount(domik.getCount() - vasya.userBasket.getCountInBasket());
        //Не придумал как сделать метод, который будет уменьшать количество выбранного продукта
        //Пришлось уменьшать количество руками, буду благодарен если подскажете.
        System.out.println(vasya.userBasket.shopCart);
        System.out.println(potato.getCount());
        System.out.println(domik.getCount());

    }
}
