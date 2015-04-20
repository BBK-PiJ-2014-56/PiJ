package quiz;

import java.util.List;

/**
 * Created by jimjohn_thornton on 20/04/15.
 */
public interface quiz {

    String getQuizName();

    List<QuestionAndAnswer> getQuestions();

    void addQuestion();

}
