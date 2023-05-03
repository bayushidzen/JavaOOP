package org.example.hw7.DecoratorFactory;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory logFactory = new LogFactory(calculableFactory);
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
