package by.patsei.cdi.qualifier.sender;

import javax.inject.Named;

@Protocol(ProtocolType.HTTP)
//@Named("HTTP")
public  class HTTPSender implements Sender {
    public void send(byte[] data) {

        System.out.println("sended via HTTP");
    }
}
