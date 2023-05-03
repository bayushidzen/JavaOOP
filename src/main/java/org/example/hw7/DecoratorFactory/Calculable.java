package org.example.hw7.DecoratorFactory;

public interface Calculable {
    Calculable sum(int arg);

    Calculable multi(int arg);

    int getResult();
}
