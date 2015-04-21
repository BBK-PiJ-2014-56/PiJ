package quiz;

import java.util.List;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public class setUpClientImpl implements setUpClient {
    @Override
    public int createQuiz(String quizName, List<QuestionAndAnswer> questionAndAnswers, List<quiz.answer> answers) {
        return 0;
    }

    @Override
    public void closeQuiz(int ID) {

    }
}
