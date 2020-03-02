package by.patsei.cdi.observers;



import javax.inject.Inject;

public class SystemLogger implements Logger {
        @Inject
        private Message message;

        @Inject
        private LogObserver observer;

        @Override
        public void print() {
            observer.observe(new LogEvent());
            System.out.println(message.getMessage());
        }
    }

