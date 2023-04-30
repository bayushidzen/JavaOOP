package org.example.hw6.Warehouse13;

import java.util.ArrayList;
import java.util.List;

public class OrderList{
    private List<Order> orderList;
    private DataBase dataBase;

    public OrderList(DataBase dataBase, List<Order> list) {
        this.dataBase = dataBase;
        this.orderList = list;
    }
    public void add(Order order) {
        orderList.add(order);
    }
}
