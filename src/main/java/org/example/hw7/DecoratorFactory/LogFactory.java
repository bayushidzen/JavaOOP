package org.example.hw7.DecoratorFactory;

public class LogFactory implements ICalculableFactory{

    private Loggable loggable;

    public LogFactory(ICalculableFactory calculableFactory) {
        this.loggable = new LoggerCalc();
    }

    @Override
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
