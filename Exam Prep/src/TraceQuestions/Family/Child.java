package TraceQuestions.Family;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class Child extends Parent {
    @Override
    public int getAge() {
        return super.getAge() / 2;
    }
    public static int getMore() {
        return 30;
    }
}
