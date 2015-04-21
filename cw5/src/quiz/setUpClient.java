package quiz;

import java.util.List;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public interface setUpClient {
    int createQuiz(String quizName, List<QuestionAndAnswer> questionAndAnswers, List<quiz.answer> answers);
    void closeQuiz(int ID);

}
