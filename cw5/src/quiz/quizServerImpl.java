package quiz;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public class quizServerImpl extends UnicastRemoteObject implements quizServer {
    protected quizServerImpl() throws RemoteException {
    }

    public String echo(String s) {
        // This println is not necessary, but helps verifying whether
        // the server has received the call or not on the remote machine
        System.out.println("Replied to some client saying ’" + s + "’");
        return s;
    }

    @Override
    public void addQuiz() {

    }

    @Override
    public void getQuiz() {

    }

    @Override
    public void addQuestion() {

    }

    @Override
    public void deleteQuestion() {

    }

    @Override
    public void getHighScore() {

    }
}
