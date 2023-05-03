package org.example.hw7.Calculator.Model;

public class CompNumber<T extends Number> extends RatNumber {
    private T complex;

    public CompNumber(T rational, T complex) {
        super(rational);
        this.complex = complex;
    }

    public T getComplex() {
        return complex;
    }
}
