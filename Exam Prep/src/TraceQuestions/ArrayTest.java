package TraceQuestions;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class ArrayTest {
    public static void main(String[] args) {

        int[] test = new int[2];
        test[0] = test[1] = 5;
        System.out.println(test[0] + "," + test[1]);
        fiddle(test, test[1]);
        System.out.println(test[0] + "," + test[1]);
    }

    static void fiddle(int[] test, int element) {
        test[0] = 10;
        test[1] = 11;
        element += 7;
        System.out.println(test[0] + "," + test[1] + "," + element);
        test = new int[2];
        test[0] = 20;
        test[1] = 21;
        System.out.println(test[0] + "," + test[1]);
        }
}

