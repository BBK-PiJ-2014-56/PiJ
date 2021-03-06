package TraceQuestions.MaxClass;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
class A{
    int max(int x, int y) {
        try {
            if (x > y)
                x++;
            else
                throw new Exception("Oh Dear!");
            System.out.println("A::max value of x is " + x);
        } catch (Exception ex) {
            System.out.println("In exception " + ex.getMessage());
            System.out.println("x = " + x + " y = " + y);
            return y;
        } finally {
            System.out.println("A::max finally block");
            throw new IllegalArgumentException("A::max Finally x = " + x);
        }
    }
}
