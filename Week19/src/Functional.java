import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jimjohn_thornton on 02/03/15.
 */
public class Functional {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("John", "Kevin", "Albert", "Betty", "Joan", "Vera", "Isabelle", "Micky");
        List<String> uc = new ArrayList<>();
        uc = friends.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(friends);
        System.out.println(uc);
    }
}

