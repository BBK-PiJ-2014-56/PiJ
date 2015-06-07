package TraceQuestions.MaxClass;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
class C extends A {
    public int max(int x, int y) {
        return super.max(x + 10, y + 10);
    }
}