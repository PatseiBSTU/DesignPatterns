package by.patsei.cdi.simple;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
//@Dependent
@ApplicationScoped
public class Service {

    @Inject
    private Message message;

    public void showМessage(){
        System.out.println(message.getMessage());
    }
}
