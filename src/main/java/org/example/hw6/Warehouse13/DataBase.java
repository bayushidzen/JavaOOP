package org.example.hw6.Warehouse13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends Nomenclature implements Searchable{
    private static List<Product> productList = new ArrayList<>();
    private List<Order> allOrders = new ArrayList<>();
    private Client client;

    public void append(Product product) {
        productList.add(product);
    }

    public boolean delete(Product product) {
        return productList.remove(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
    @Override
    public List<Order> findByClientName(String name) {
        List<Order> searchResult = new ArrayList<>();
        for (Order c: allOrders) {
            if(c.getClient().equals(client)){
                searchResult.add(c);
            }
        }
        return searchResult;
    }

    @Override
    public List<Order> findByProductName(String product) {
        List<Order> searchResult = new ArrayList<>();
        for (Order c: allOrders) {
            if(c.getProduct().equals(product)){
                searchResult.add(c);
            }
        }
        return searchResult;
    }
}
