package echo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by jimjohn_thornton on 09/03/15.
 */
public class EchoServerLauncher {
    void launch(){
//        if (System.getSecurityManager()==null){
//            System.setSecurityManager(new RMISecurityManager());
//        }
        try {
            LocateRegistry.createRegistry(1099);
            EchoServer server = new EchoServer();
            String registryHost = "//localhost/";
            String serviceName = "echo";
            Naming.rebind(registryHost + serviceName, server);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EchoServerLauncher echoServer = new EchoServerLauncher();
        echoServer.launch();
    }
}
