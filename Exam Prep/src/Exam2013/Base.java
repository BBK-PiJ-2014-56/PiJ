package Exam2013;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class Base {
    public void methodOne() {
        System.out.println("A");
        methodTwo();
    }
    public void methodOne(int a) {
        System.out.println("W");
        methodTwo();
    }
    public void methodTwo() {
        System.out.print("B");
    }
}
