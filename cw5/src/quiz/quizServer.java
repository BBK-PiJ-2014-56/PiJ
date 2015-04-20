package quiz;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public interface quizServer extends Remote {

    void addQuiz() throws RemoteException;

    void getQuiz() throws RemoteException;

    void addQuestion() throws RemoteException;

    void deleteQuestion() throws RemoteException;

    void getHighScore() throws RemoteException;

}
