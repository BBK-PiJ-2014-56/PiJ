package echo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by jimjohn_thornton on 09/03/15.
 */
public class EchoServer extends UnicastRemoteObject implements EchoService{
    public EchoServer() throws RemoteException {

    }

    @Override
    public String echo(String s) throws RemoteException {
        System.out.println("Replied to client saying " + s);
        return s;
    }
}
