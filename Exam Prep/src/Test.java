import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimjohn_thornton on 06/06/15.
 */
public class Test<T>  {
    List<T> list = new ArrayList<T>();
    public Test(){

    }
    public void populate(T t){
        list.add(t);
    }
    public static  void main(String[] args) {
        new Test<String>().populate("abc");
    }
}
