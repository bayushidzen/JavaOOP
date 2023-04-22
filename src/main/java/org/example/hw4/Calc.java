package org.example.hw4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class Calc {
    public double sums(List<? extends Number> list){
        Double sum = 0.0;
        for (Number num:
             list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
