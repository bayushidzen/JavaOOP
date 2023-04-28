package org.example.hw5.Model;

public class RatNumber<T extends Number> {
    protected T rational;

    public RatNumber(T rational) {
        this.rational = rational;
    }

    public T getRational() {
        return rational;
    }
}
