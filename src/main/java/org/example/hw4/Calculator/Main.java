package org.example.hw4.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalcSum calcSum = new CalcSum();
        CalcDiv calcDiv = new CalcDiv();
        CalcMultip calcMultip = new CalcMultip();
        List<Double> lsd = new ArrayList<>();
        for(int i =0; i < 10; i++){
            lsd.add((double) (Math.round((Math.random()+0.01)*10000))/100);
            System.out.println(lsd.get(i));
        }

        System.out.println("Сумма элементов: " + calcSum.sums(lsd));
        System.out.print("Частное элементов: ");
        System.out.printf("%.20f\n",calcDiv.divs(lsd));
        System.out.print("Произведение элементов: ");
        System.out.printf("%.2f",calcMultip.multips(lsd));
        CalcBinConvert calcBinConvert = new CalcBinConvert();
        int intNum = 10;
        double doubleNum = 11.95;
        String bina = "";
        for (int i = 0; i <= intNum; i++) {
            bina += Integer.toBinaryString(i);
            System.out.println(Integer.toBinaryString(i));
            //System.out.println("bina " + bina);
        }
        System.out.println((long)doubleNum);
        System.out.println(Long.toBinaryString((long)doubleNum));
    }
}
