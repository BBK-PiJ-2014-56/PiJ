package quiz;

import java.rmi.Remote;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public interface quizServer extends Remote {

    void addQuiz();

    void getQuiz();

    void addQuestion();

    void deleteQuestion();

    void getHighScore();

}
