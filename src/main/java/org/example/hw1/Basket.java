package org.example.hw1;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    protected String ownedItems;
    protected Integer countInBasket;
    //protected Map<Category, Integer> shopCart;

    Map<String, Integer> shopCart = new HashMap<>();
    public Basket(){
    }

    public void AddToBasket(String name,int count_items){
        ownedItems = name;
        countInBasket = count_items;
        shopCart.put(ownedItems,count_items);
        RemoveFromStore(ownedItems,count_items);

    }

    private void RemoveFromStore(String name, int countItems) {
        //Не придумал как сделать метод, который будет уменьшать количество выбранного продукта
    }


    @Override
    public String toString() {
        return "Корзина{" +
                "Продукт = " + ownedItems +
                ", Количество = " + countInBasket +
                '}';
    }

    public String getOwnedItems() {
        return ownedItems;
    }

    public void setOwnedItems(String ownedItems) {
        this.ownedItems = ownedItems;
    }

    public Integer getCountInBasket() {
        return countInBasket;
    }

    public void setCountInBasket(Integer countInBasket) {
        this.countInBasket = countInBasket;
    }

}
