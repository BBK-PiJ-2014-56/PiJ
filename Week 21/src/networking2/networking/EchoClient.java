package networking2.networking;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

//import echo.EchoService;

public class EchoClient {
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        Remote service = Naming.lookup("//127.0.0.1:1099/echo");
        EchoService echoService = (EchoService) service;
        String receivedEcho = echoService.echo("Poopie");
    }
}