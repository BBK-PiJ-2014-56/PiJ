package Exam2014;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jimjohn_thornton on 06/06/15.
 */
public class MultiSetMap implements MultiSet {
    private Map<String, Integer> myMap = new HashMap<>();
    @Override
    public int size() {
        int sum = 0;
        for (Integer x : myMap.values())
            sum =+ x;
        return sum;
    }

    @Override
    public boolean contains(String s) {
        for (String s1 : myMap.keySet())
            if (s.equals(s1)) return true;
        return false;
    }

    @Override
    public int occurrences(String s) {
        if (myMap.containsKey(s))
            return myMap.get(s);
        return 0;
    }

    @Override
    public void add(String s) {
        if (myMap.containsKey(s))
            myMap.put(s, myMap.get(s)+1);
        else myMap.put(s, 1);
    }

    @Override
    public boolean remove(String s) {
        if (myMap.containsKey(s)) {
            if (occurrences(s) > 1) {
                myMap.put(s, myMap.get(s) - 1);
                return true;
            }
            else {
                myMap.remove(s);
                return true;
            }
        }
        return false;
    }
}
