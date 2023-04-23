package org.example.hw4.Calculator;

import java.util.List;

public class CalcMultip {
    public double multips(List<? extends Number> list){
        Double mult = (double)list.get(0);
        for (int i = 1; i < list.size(); i++) {
            mult *= (double)list.get(i);
        }
        return mult;
    }
}
