package Exam2013;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class Derived extends Base {
    public void methodOne(int a) {
        super.methodOne();
        System.out.print("X");
    }
    public void methodOne(Integer a) {
        super.methodOne();
        System.out.print("C");
    }
    public void methodTwo() {
        super.methodTwo();
        System.out.print("D");
    }
}

