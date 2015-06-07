package Exam2013;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class q5 {
    public static void main(String[] args) {
        reduceAndRebuild("abcde");
        Base b = new Derived();
        b.methodOne(0);
    }

    public static void reduceAndRebuild(String str) {
        System.out.println(str);
        if (str.length()>1) reduceAndRebuild(str.substring(0, str.length()-1));
        System.out.println(str);
    }
}
