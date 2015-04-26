package networking2.networking;

//import echo.EchoServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class EchoLauncher {

    public static void main(String[] args) {
        EchoLauncher el = new EchoLauncher();
        el.launch();

    }
    private void launch() {
        // 1. If there is no security manager, start one
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
            // 2. Create the registry if there is not one
            LocateRegistry.createRegistry(1099);
            // 3. Create the server object
            EchoServer server = new EchoServer();
            // 4. Register (bind) the server object on the registy.
            // The registry may be on a different machine
            String registryHost = "//localhost/";
            String serviceName = "echo";
            Naming.rebind(registryHost + serviceName, server);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}