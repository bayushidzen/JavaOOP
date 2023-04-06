package org.example.hw1;

public class Item {
    protected String name;
    protected Double price;
    protected Integer rating;



    @Override
    public String toString() {
        return "Продукт{" +
                "Название='" + name + '\'' +
                ", цена=" + price +
                ", рейтинг=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

