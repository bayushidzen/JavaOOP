package org.example.hw1;

public class Vegetables extends Category{
    private String name;
    private Integer count;

    public Vegetables(String name, Integer count){
        this.name = name;
        this.count = count;
    }

    public Vegetables(){
    }

    @Override
    public String toString() {
        return "Овощи{" +
                "Название = '" + name + '\'' +
                ", Количество на складе = " + count +
                '}';
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

}
