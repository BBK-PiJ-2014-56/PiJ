import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jimjohn_thornton on 02/03/15.
 */
public class Towns {

    static boolean foundTown(List<String> towns, String town){
        boolean found = false;

        for (String t:towns) {
            if (t.equals(town)){
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        List<String> towns = Arrays.asList("Chelmsford", "Canterbury", "Oxford", "Cambridge", "Norwich", "Exeter");
        System.out.println(towns);
        Iterator i = towns.iterator();
//        while (i.hasNext()) {
//            System.out.print(i.next() + ", ");
//        }
        for (String s : towns)
            System.out.print(s + ", ");

        System.out.println(foundTown(towns, "Exeter"));
        System.out.println(foundTown(towns, "Bath"));
        System.out.println(towns.contains("Exeter"));
        System.out.println(towns.contains("Bath"));
    }
}
