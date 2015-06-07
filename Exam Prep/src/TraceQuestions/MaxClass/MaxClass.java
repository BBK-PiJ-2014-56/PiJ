package TraceQuestions.MaxClass;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class MaxClass {
    public static void main(String args[]) {
        try {
            C c = new C();
            System.out.println(c.max(13, 29));
        } catch (RuntimeException rte) {
            System.out.println(rte);
        } finally {
            System.out.println("In finally of main");
        }
    }
}
