package echo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by jimjohn_thornton on 09/03/15.
 */
public class EchoClientLauncher {
    public static void main(String[] args) {
        EchoClientLauncher e = new EchoClientLauncher();
        //System.setProperty("java.security.policy","file:/security.txt");
        e.launch();
    }
    private void launch() {
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
            Remote service = Naming.lookup("127.0.0.1/:1099/echo");
            EchoService echoService = (EchoService) service;
            String recievedEcho = echoService.echo("Hello!");
//            LocateRegistry.createRegistry(1099);
//            EchoServer server = new EchoServer();
//            String registryHost = "//localhost/";
//            String serviceName = "echo";
//            Naming.rebind(registryHost + serviceName, server);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }


    }
}
