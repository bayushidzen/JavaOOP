package org.example.hw5.Controller;

import org.example.hw5.Model.CompNumber;
import org.example.hw5.Model.RatNumber;

public class CompDataControl implements DataOperation {

    @Override
    public RatNumber summa(RatNumber number1, RatNumber number2) {
        return new CompNumber(number1.getRational().doubleValue()
                + number2.getRational().doubleValue(),
                ((CompNumber) number2).getRational().doubleValue()
                        + ((CompNumber) number2).getComplex().doubleValue());
    }

    @Override
    public RatNumber subtraction(RatNumber number1, RatNumber number2) {
        return new CompNumber(number1.getRational().doubleValue()
                - number2.getRational().doubleValue(),
                ((CompNumber) number2).getRational().doubleValue()
                        - ((CompNumber) number2).getComplex().doubleValue());
    }

    @Override
    public RatNumber multiply(RatNumber number1, RatNumber number2) {
        return new CompNumber(number1.getRational().doubleValue()
                * number2.getRational().doubleValue(),
                ((CompNumber) number2).getRational().doubleValue()
                        * ((CompNumber) number2).getComplex().doubleValue());
    }

    @Override
    public RatNumber division(RatNumber number1, RatNumber number2) {
        double div1 = number2.getRational().doubleValue();
        double div2 =((CompNumber) number2).getComplex().doubleValue();
        return new CompNumber(number1.getRational().doubleValue() / div1,
                ((CompNumber) number2).getRational().doubleValue() / div2);
    }
}
