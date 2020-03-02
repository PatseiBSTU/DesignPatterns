package by.patsei.cdi.qualifier;


import javax.enterprise.context.Dependent;


@Dependent
public class Message {

       public String getMessage(){
           return "Hello World!!";
    }
}
