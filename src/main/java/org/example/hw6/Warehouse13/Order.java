package org.example.hw6.Warehouse13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    Integer id;
    Client client;
    LocalDate date;
    LocalTime time;
    Product product;
    Integer amount;

}
