package org.example.hw6.Warehouse13;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product cookBooks = new Product(1000, 500);
        Product fantasticBooks = new Product(10000, 300);
        Product scienceBooks = new Product(500, 1500);

        Client best = new Client(001,"OOO Best","redSquare",001,"totsamii@email");
        Client optovik = new Client(243,"OOO Optovik","Moscow",5556678,"optovik@mail.ru");

        DataBase books = new DataBase();
        books.append(cookBooks);
        books.append(fantasticBooks);
        books.append(scienceBooks);

        System.out.println(books.getProductList());
        books.findByClientName("OOO Best");

    }
}
