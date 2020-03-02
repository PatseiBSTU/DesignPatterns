package by.patsei.cdi.complex;



import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

public class SystemLogger implements Logger {
        @Inject
        private Message message;

        @Override
        public void print() {
            System.out.println(message.getMessage());
        }
    }

