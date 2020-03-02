package by.patsei.cdi.observers;

import java.util.Date;

public class LogEvent {
    Date date = new Date();

    public String getDate() {
        return date.toString();
    }
}

