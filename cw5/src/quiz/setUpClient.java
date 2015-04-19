package quiz;

import java.util.List;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public interface setUpClient {
    int createQuiz(String quizName, List<Question> questions, List<Answer> answers);
    void closeQuiz(int ID);

}
