package org.example.hw5.Controller;

import org.example.hw5.Model.RatNumber;

public interface DataOperation {
    public RatNumber summa(RatNumber number1, RatNumber number2);
    public RatNumber subtraction(RatNumber number1, RatNumber number2);
    public RatNumber multiply(RatNumber number1, RatNumber number2);
    public RatNumber division(RatNumber number1, RatNumber number2);
}
