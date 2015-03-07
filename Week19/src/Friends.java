import java.util.Arrays;
import java.util.List;

/**
 * Created by jimjohn_thornton on 02/03/15.
 */
public class Friends {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("John", "Kevin", "Albert", "Betty", "Joan", "Vera", "Isabelle", "Micky");
//
//        for (String s : friends) {
//            System.out.println(s);
//        }
        //Consumer c = new MyConsumer();

//        friends.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //the Java 8 way
        //friends.forEach(s -> System.out.println(s));
        friends.forEach(System.out::println);
    }
}
//class MyConsumer implements Consumer {
//    @Override
//    public void accept(Object o) {
//        System.out.println(o);
//    }
//}