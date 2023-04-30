package org.example.hw6.Warehouse13;

import java.util.List;

public interface Searchable {
    List<Order> findByClientName(String name);
    List<Order> findByProductName(String product);
}
