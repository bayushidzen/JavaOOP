package org.example.hw7.DecoratorFactory;

public class LoggerCalc implements Loggable{

    @Override
    public void saveLog(String str) {
        System.out.println("Error: " + str);
    }

}
