package quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimjohn_thornton on 20/04/15.
 */
public class quizImpl implements quiz {

    private String quizName;
    private List<QuestionAndAnswer> questions;
    public quizImpl (String quizName) {
        this.quizName = quizName;
        this.questions = new ArrayList<QuestionAndAnswer>();
    }

    @Override
    public String getQuizName() {
        return this.quizName;
    }

    @Override
    public List<QuestionAndAnswer> getQuestions() {
        return this.questions;
    }

    @Override
    public void addQuestion(String question, String a1, String a2, String a3, String a4, int x) {
        questions.add(new QuestionAndAnswer(question, new answerImpl(a1, a2, a3, a4, x)));
    }
}
