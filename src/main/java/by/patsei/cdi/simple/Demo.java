package by.patsei.cdi.simple;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Demo {
    public static void main(String[] args) {
        Weld weld = new Weld();
        try ( WeldContainer container = weld.initialize()) {
            container.select(Service.class).get().showМessage();
        }
    }
}
