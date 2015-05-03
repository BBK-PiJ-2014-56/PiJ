/**
 * Created by jimjohn_thornton on 27/04/15.
 */
public class NotGenericClass {

    public static <T> void printArray(T[] someArray) {
        for (T element : someArray) {
            System.out.print(" " + element);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T ele1, T ele2, T ele3){

        T max = ele1;
        if (ele2.compareTo(max) > 0)
            max = ele2;
        if (ele3.compareTo(max) > 0)
            max = ele3;
        System.out.println(max);
        return max;
    }

    public static <T extends Number> T sum(T... vargs) {
        return (T) sum(0, vargs);
    }
    public static <T extends Number> T sum(T runningTotal, T[] vargs) {
        if (vargs.length == 0) return runningTotal;

        //figure this out
        return runningTotal ;//+ sum(vargs[vargs.length-1], vargs.);

    }


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        maximum(3, 4, 5);
        maximum(7.8, 8.7, 6.6);
        maximum("apples", "cake", "bananas");

        int i = sum(3, 4, 5);
        double d = sum(7.8, 8.7, 6.6);
    }
}
