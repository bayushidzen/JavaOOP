package org.example.hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Simple
        SimpleBox smp = new SimpleBox("Str");
        SimpleBox smpl = new SimpleBox(200);
        SimpleBox smple = new SimpleBox(100);
        smple.setObj("150");
        Integer sums = null;
        if(smple.getObj() instanceof Integer && smpl.getObj() instanceof Integer){
            sums = (Integer) smpl.getObj() + (Integer) smple.getObj();
        }
        else System.out.println("Неверный тип данных");

        System.out.println(smpl);
        System.out.println(smp);
        System.out.println(smple);
        System.out.println(sums);

        //Generic
        GenBox<Integer> g1 = new GenBox<>(10);
        GenBox<Integer> g2 = new GenBox<>(20);

        Integer sums2 = g1.getObj() + g2.getObj();
        System.out.println(sums2);

        //Average
        Double[] arrd = new Double[2];
        arrd[0] = 23.4;
        arrd[1] = 75.0;
        Integer[] arri = new Integer[2];
        arri[0] = 86;
        arri[1] = 14;
        BoxWinNumber<Double> boxd1 = new BoxWinNumber<>(arrd);
        BoxWinNumber<Integer> boxi1 = new BoxWinNumber<>(arri);

        System.out.println(boxd1.average());
        System.out.println(boxi1.average());
        System.out.println(boxd1.compare(boxi1));

        //Calculator
        Calc calcsum = new Calc();
        List<Double> lsd = new ArrayList<>();
        List<Integer> lsi = new ArrayList<>();
        for(int i =0; i < 10; i++){
            lsd.add((double) i);
            lsi.add(i);
        }
        System.out.println(calcsum.sums(lsd));
        System.out.println(calcsum.sums(lsi));

        //Cache
        List<Employee> empl = new ArrayList<>();
        LRUCache<Employee> employeeLRUCache = new LRUCache<>(5);
        for (int i = 0; i < 10; i++) {
            Employee em = new Employee("Ivanov"+i,1254.0, "job"+i);
            employeeLRUCache.addElement(em);
        }
        System.out.println(employeeLRUCache);

    }
}
