package TraceQuestions.Family;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public abstract class Grandparent {
    private final static int HowMuch = 100;
    public abstract boolean good();
    public static int getMore() {
        return HowMuch;
    }
    public void eat() {
        if (good())
        System.out.println("Good!");
        else
        System.out.println("Bad!");
    }
}
