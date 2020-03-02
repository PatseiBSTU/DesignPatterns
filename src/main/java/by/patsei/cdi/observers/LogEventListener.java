package by.patsei.cdi.observers;

import javax.enterprise.event.Observes;

public class LogEventListener {
    public void logEvent(@Observes LogEvent event){
        System.out.println("Message Date: " + event.getDate());
    }
}
