package echo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by jimjohn_thornton on 09/03/15.
 */
public interface EchoService extends Remote {
    public String echo(String s) throws RemoteException;
}
