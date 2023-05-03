package org.example.hw7.Calculator.Controller;

import org.example.hw7.Calculator.Model.RatNumber;

public class RatNumControl implements DataOperation {

    @Override
    public RatNumber summa(RatNumber number1, RatNumber number2) {
        return new RatNumber(number1.getRational().doubleValue()
                + number2.getRational().doubleValue());
    }

    @Override
    public RatNumber subtraction(RatNumber number1, RatNumber number2) {
        return new RatNumber(number1.getRational().doubleValue()
                - number2.getRational().doubleValue());
    }

    @Override
    public RatNumber multiply(RatNumber number1, RatNumber number2) {
        return new RatNumber(number1.getRational().doubleValue()
                * number2.getRational().doubleValue());
    }

    @Override
    public RatNumber division(RatNumber number1, RatNumber number2) {
        double dev = number2.getRational().doubleValue();
        if (dev == 0) {
            System.out.println("Деление на 0");
            return null;
        } else {
            return new RatNumber(number1.getRational().doubleValue() / dev);
        }
    }

}
