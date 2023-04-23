package org.example.hw4.Calculator;

import java.util.List;

public class CalcSum {
    public double sums(List<? extends Number> list){
        Double sum = 0.0;
        for (Number num:
                list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
