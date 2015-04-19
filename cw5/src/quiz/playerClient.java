package quiz;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public interface playerClient {

    //selects quiz to be played
    void playQuiz(int ID);

    //displays a list of available quizzes
    void viewQuzzes();

    //shows score
    void getFinalScore();
}
