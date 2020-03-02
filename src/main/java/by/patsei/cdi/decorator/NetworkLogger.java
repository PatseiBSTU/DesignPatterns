package by.patsei.cdi.decorator;


import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@Alternative
public class NetworkLogger  implements Logger {

    @Inject
    private Message message;

    @Override
    public void print() {
         System.out.println("Remote log system"+ message.getMessage());
    }
}
