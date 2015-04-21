package quiz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jimjohn_thornton on 21/04/15.
 */
public class quizLauncherTest {

    private playerImpl James;
    private quizImpl quiz1;
    private QuestionAndAnswer q1;

    @Before
    public void setUp() {
        James = new playerImpl("James");
        quiz1 = new quizImpl("quiz1");
        quiz1.addQuestion("what does the cat want?", "food", "petting", "water", "love");
    }

    @Test
    public void getQuizNameTest() {
        assertEquals("quiz1", quiz1.getQuizName());
    }

    @Test
    public void getQuestionsTest() {
        assertEquals(1, quiz1.getQuestions().size());
    }

    @Test
    public void addQuestionTest() {
        quiz1.addQuestion("why does the cat eat so much?", 2);
    }

}