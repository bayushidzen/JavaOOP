package org.example.hw4.Calculator;

import java.util.List;

public class CalcDiv {
    public double divs(List<? extends Number> list){
        Double div = (double)list.get(0);
        for (int i = 1; i < list.size(); i++) {
            div /= (double)list.get(i);
        }
        return div;
    }
}
