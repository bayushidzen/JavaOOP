package org.example.hw4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class LRUCache<T> {
    private ArrayList<T> list;
    private Integer size;

    public LRUCache(Integer size) {
        this.size = size;
        this.list = new ArrayList<>();
    }

    public void addElement(T element) {
        if(this.list.size()<size){
            this.list.add(element);
        } else {
            this.list.remove(0);
            this.list.add(element);
        }
    }
    public T getElement(Integer position) {
        if (position < list.size() && position > -1) {
            return list.get(position);
        } else {
            System.out.println("Указанного элемента нет");
            return null;
        }
    }
    public List<T> getAllElements(){
        return list;
    }
}
