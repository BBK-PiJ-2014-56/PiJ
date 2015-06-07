package TraceQuestions.Contractors;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
class SubConstructor extends Constructor {
    protected String s;
    SubConstructor(int x) {
        super("label");
        x = this.x;
        System.out.println("[4] x = " + x);
    }
    public SubConstructor(String s) {
        this(12);
        this.s = s;
        x = 19;
        System.out.println("[5] x = " + x);
    }
}