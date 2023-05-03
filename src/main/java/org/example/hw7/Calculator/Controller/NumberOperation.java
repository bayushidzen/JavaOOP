package org.example.hw7.Calculator.Controller;

public class NumberOperation<T extends Number> {
    public double summa(T number1, T number2){
        return number1.doubleValue() + number2.doubleValue();
    };
    public double subtraction(T number1, T number2){
        return number1.doubleValue() - number2.doubleValue();
    };
    public double multiply(T number1, T number2){
        return number1.doubleValue() * number2.doubleValue();
    };
    public double division(T number1, T number2){
        double dev = number2.doubleValue();
        if (dev == 0) {
            System.out.println("Деление на 0");
            return number1.doubleValue();
        } else {
            return number1.doubleValue() / dev;
        }
    };
}
