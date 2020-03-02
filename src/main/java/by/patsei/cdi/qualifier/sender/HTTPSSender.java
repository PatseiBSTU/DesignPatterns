package by.patsei.cdi.qualifier.sender;

import javax.inject.Named;

@Protocol(ProtocolType.HTTPS)
//@Named("HTTPS")
public  class HTTPSSender implements Sender {
    public void send(byte[] data) {

        System.out.println("sended via HTTPS");
    }
}
