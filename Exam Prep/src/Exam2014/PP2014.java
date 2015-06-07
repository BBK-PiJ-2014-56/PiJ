package Exam2014;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimjohn_thornton on 06/06/15.
 */
public class PP2014 {
    public static void main(String[] args) {
        List<Character> l = new ArrayList<Character>();
        List<Character> l2 = new ArrayList<Character>();
        List<Character> l3 = new ArrayList<Character>();
        l.add ('1');
        l.add ('+');
        l.add ('2');
        l.add ('-');
        l.add ('4');
        System.out.println(genericMax(l, 1, 4));
        //Collections.copy(l2, l);
        System.out.println(l2);
        System.out.println(isValid(l));
        l.add('-');
        System.out.println(isValid(l));
        l.add('1');
        System.out.println(isValid(l));
        System.out.println(l2);
        System.out.println(l2.size());
        //l3 = exchange(l2,2,3);
//        System.out.println(l);
        for (Character x : l3) {
            System.out.println(x);
        }
    }

    // says if number is expected or operator expected
    private static boolean isNum = true;

    public static boolean isValid (List<Character> list) {
        if(list.size()>1) {
            Character x = list.remove(0);
            if (isNum == true && (x == '1' || x == '2'||x == '3'||x == '4'||x == '5'||x == '6'||x == '7'||x == '8'||x == '9'|| x == '0')) {
                isNum = false;
                isValid(list);
            }
            else if (isNum == false && (x == '+' || x == '-')){
                isNum = true;
                isValid(list);
            }
            else {
                isNum = true;
                return false;
            }
        } else if (list.size()==1) {
            Character x = list.remove(0);
            if (isNum == true && (x == '1' || x == '2'||x == '3'||x == '4'||x == '5'||x == '6'||x == '7'||x == '8'||x == '9'|| x == '0')) {
                return true;
            }
            else return false;
        }
        return true;
    }

    public static <T> List<T> exchange(List<T> list, int i, int j) {
//        List<T> tempArray = new ArrayList<T>();
//        tempArray = list;
        T a = list.get(i);
        T b = list.get(j);
        list.set(i,b);
        list.set(j,a);
        return list;
    }
    public static <T> T[] exchange2(T[] list, int i, int j) {
        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }

    public static <T extends Comparable<T>> T genericMax(List<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int x = begin; x < end; x++) {
            T a = list.get(x);
            T b = list.get(x+1);
            if (a.compareTo(b)<0) {
                max = b;
            }
        }
        return max;
    }
}
