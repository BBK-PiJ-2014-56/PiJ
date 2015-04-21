package quiz;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jimjohn_thornton on 21/04/15.
 */
public class answerImpl implements quiz.Answer {

    private Set<String> answers = new HashSet<String>();
    private int correctAnswer;

    public answerImpl(String a1, String a2, String a3, String a4, int x) {
        this.answers.add(a1);
        this.answers.add(a2);
        this.answers.add(a3);
        this.answers.add(a4);
        this.correctAnswer = x;
    }

    @Override
    public boolean checkAnswer(int x) {
        if (correctAnswer == x)
            return true;
        if (x < 1 || x > 4) {
            System.out.println("try again");
            return false;
        }
        else return false;
    }
}
