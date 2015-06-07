package Exam2014;

import java.util.Scanner;

/**
 * Created by jimjohn_thornton on 06/06/15.
 */
public class Match {
    public static void main(String[] args) {
        String s1 = "actgcta";
        String s2 = "acag";
        //File f = "tiny.txt";
        int min = 1000;
        Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()) {
            String s = sc.nextLine();
            int tempmin = similarity(s1, s2);
            if (min>tempmin){
                min = tempmin;
            }
        //}
        System.out.println(min);
    }
    public static int similarity(String s1, String s2) {
        int matches = 0;
        String shortest;
        if (s1.length()>s2.length())
            shortest = s2;
        else shortest = s1;
        for(int x =0; x<shortest.length(); x++) {
            if (s1.charAt(x)==s2.charAt(x))
                matches++;
        }
        return matches;
    }
}
