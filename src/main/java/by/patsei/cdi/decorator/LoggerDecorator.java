package by.patsei.cdi.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public abstract class LoggerDecorator implements Logger {
    public final static String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Inject
    private Message message;

    @Inject
    @Delegate
    private Logger delegate;

    @Override
    public void print() {
        System.out.println(ANSI_GREEN);
        delegate.print();
        System.out.println(ANSI_RESET);
    }
}