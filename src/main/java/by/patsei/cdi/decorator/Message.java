package by.patsei.cdi.decorator;


import javax.enterprise.context.Dependent;


@Dependent
public class Message {

       public String getMessage(){
           return "Hello World!!";
    }
}
