package echo;

import java.net.MalformedURLException;
import java.rmi.*;

/**
 * Created by jimjohn_thornton on 09/03/15.
 */
public class EchoClientLauncher {
    private void launch() {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Remote service = Naming.lookup("127.0.0.1/:1099/echo");
            EchoService echoService = (EchoService) service;
            String recievedEcho = echoService.echo("Hello!");
            /*LocateRegistry.createRegistry(1099);
            EchoServer server = new EchoServer();
            String registryHost = "//localhost/";
            String serviceName = "echo";
            Naming.rebind(registryHost + serviceName, server);*/
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }


    }
}
