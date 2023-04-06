package org.example.hw1;

public class Milk extends Category{
    private String name;
    private Integer count;

    public Milk(String name, Integer count){
        this.name = name;
        this.count = count;
    }
    public Milk(){
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Молоко{" +
                "бренд = '" + name + '\'' +
                ", Количество = " + count +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}
