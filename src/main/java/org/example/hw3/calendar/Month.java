package org.example.hw3.calendar;

public enum Month {
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OKT(10), NOV(11), DEC(12);
    private int number;

    Month(int number){
        this.number = number;
    }
    Month(){

    }
    public int getNumber(){
        return number;
    }
}

