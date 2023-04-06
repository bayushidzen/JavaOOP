package org.example.hw1;

import java.util.Arrays;

public class Category {
    protected String name;
    protected Item[] category_items;
    protected int count_items;

    public Category(String name, Integer count_items) {
        this.name = name;
        this.count_items = count_items;
    }

    public Category() {
    }
    public void RemoveFromStore(String name, int count_items){
        this.count_items = this.count_items - count_items;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getCategory_items() {
        return category_items;
    }

    public void setCategory_items(Item[] category_items) {
        this.category_items = category_items;
    }

    public Integer getCount_items() {
        return count_items;
    }

    public void setCount_items(Integer count_items) {
        this.count_items = count_items;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name = '" + name + '\'' +
                ", category_items = " + Arrays.toString(category_items) +
                ", count_items = " + count_items +
                '}';
    }
}
