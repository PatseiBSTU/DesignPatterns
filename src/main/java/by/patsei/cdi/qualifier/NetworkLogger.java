package by.patsei.cdi.qualifier;


import by.patsei.cdi.qualifier.sender.Protocol;
import by.patsei.cdi.qualifier.sender.ProtocolType;
import by.patsei.cdi.qualifier.sender.Sender;

import javax.inject.Inject;
import javax.inject.Named;

public class NetworkLogger  implements Logger {

    @Inject
    private Message message;

   //@Named("HTTP")
    @Inject
    @Protocol(ProtocolType.HTTPS)
    private Sender sender;

    @Override
    public void print() {
        sender.send(null);
        System.out.println("Remote log system"+ message.getMessage());
    }
}
