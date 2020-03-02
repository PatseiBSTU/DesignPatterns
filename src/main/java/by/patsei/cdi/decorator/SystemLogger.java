package by.patsei.cdi.decorator;



import javax.inject.Inject;

public class SystemLogger implements Logger {
        @Inject
        private Message message;

        @Override
        public void print() {

            System.out.println(message.getMessage());
        }
    }

