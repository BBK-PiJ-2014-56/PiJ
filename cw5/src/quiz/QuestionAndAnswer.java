package quiz;

import java.util.List;

/**
 * Created by jimjohn_thornton on 19/04/15.
 */
public class QuestionAndAnswer {
    private List<String> questions;
    private answerImpl answers;
    private int questionNumber = 0;
    private String question;
    private int answer;
    public QuestionAndAnswer (String question, answerImpl answers) {
        this.question = question;
        this.answers = answers;
        this.questionNumber = questionNumber++;
        //maybe change this to an answer object...?
        this.answer = answer;


    }
}
