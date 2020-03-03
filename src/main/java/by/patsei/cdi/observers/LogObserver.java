package by.patsei.cdi.observers;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class LogObserver {
    @Inject
    private Event<LogEvent> event;
    public void observe(LogEvent logEvent) {
       event.fire(logEvent);
    }
}