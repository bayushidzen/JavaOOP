package org.example.hw1;

public class Bread extends Category{
    private String name;
    private Integer count;
    public Bread(String name, Integer count){
        this.name = name;
        this.count = count;
    }
    public Bread(){
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Хлеб{" +
                "Бренд = '" + name + '\'' +
                ", Количество = " + count +
                '}';
    }
}
