package by.patsei.cdi.complex;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;


@Dependent
public class Message {

       public String getMessage(){
           return "Hello World!!";
    }
}
