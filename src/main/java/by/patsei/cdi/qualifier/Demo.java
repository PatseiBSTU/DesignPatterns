package by.patsei.cdi.qualifier;

import by.patsei.cdi.qualifier.sender.Protocol;
import by.patsei.cdi.qualifier.sender.ProtocolType;
import by.patsei.cdi.qualifier.sender.Sender;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.lang.annotation.Annotation;

public class Demo {
    public static void main(String[] args) {
        Weld weld = new Weld();
        try ( WeldContainer container = weld.initialize()) {
            container.select(Logger.class).get().print();

            Protocol protocol = new Protocol() {
                @Override
                public Class<? extends Annotation> annotationType() {
                    return Protocol.class;
                }
                @Override
                public ProtocolType value() {
                    String value = "HTTP";
                    return ProtocolType.valueOf(value);
                }

                @Override
                public String comment() {
                    return null;
                }
            };
            container.select(Sender.class, protocol).get().send(null);

        }
    }
}
