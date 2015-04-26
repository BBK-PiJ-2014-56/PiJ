package networking2.networking;

//import echo.EchoService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EchoServer extends UnicastRemoteObject implements EchoService {
    public EchoServer() throws RemoteException {
        // nothing to initialise for this server
    }

    @Override
    public String echo(String s) throws RemoteException {
        // This println is not necessary, but helps verifying whether
        // the server has received the call or not on the remote machine
        if (s.equals("date")) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar now = Calendar.getInstance();
            System.out.println("Replied to some client saying '" + sdf.format(now.getTime())+ "'");
            return (sdf.format(now.getTime()));
        } else if (Character.isDigit(s.charAt(0))) {
            System.out.println("Replied to some client saying '" + CommandLineCalculator.Calculate(s).toString()+ "'");
            return CommandLineCalculator.Calculate(s).toString();
        }

        else {
            System.out.println("Replied to some client saying '" + s + "'");
            return s;
        }

    }
}