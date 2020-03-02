package by.patsei.cdi.qualifier;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@Alternative
public class SystemLogger implements Logger {
        @Inject
        private Message message;

        @Override
        public void print() {
            System.out.println(message.getMessage());
        }
    }

