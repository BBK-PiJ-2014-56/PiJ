package Exam2013;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class bottomAndTop {

    public static void main(String[] args) {

        int top;
        int bottom;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the top number");
        top = sc.nextInt();
        System.out.println("enter the bottom number");
        bottom = sc.nextInt();
        int value;
        System.out.println("enter a list of numbers ending in 0");
        ArrayList<Integer> list = new ArrayList<>();
        do {
            value = sc.nextInt();
            list.add(value);
        } while (value!=0);

        int smallsum = 0;
        int bigsum = 0;
        for (int x : list) {
            if (x<top && x>bottom){
                smallsum += x;
            } else {
                bigsum += x;
            }

        }
        System.out.println(bigsum);
        System.out.println(smallsum);
    }
}
