package echo;

import java.rmi.RemoteException;

/**
 * Created by jimjohn_thornton on 09/03/15.
 */
public class EchoServiceImpl {
    public static void main(String[] args) throws RemoteException {
        EchoServerLauncher es = new EchoServerLauncher();
        es.launch();
    }
    /*
    private void launch(){
        if (System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }
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
    }*/
}
