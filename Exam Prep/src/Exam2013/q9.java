package Exam2013;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class q9 {
    public static void main(String[] args) {
        int[] sample = //new int[30]; // sample size
                {0, 23, 4, 5, 5, 6, 34, 56, 99, 45, 87};
        // values are stored in sample
        // values have the range 0..99
        Map<Integer, Integer> freqDist = new HashMap<>();
        // compute distribution for (a)
        for (Integer x : sample) {
            if (freqDist.containsKey(x))
                freqDist.put(x, freqDist.get(x) + 1);
            else freqDist.put(x, 1);
        }

        for (int i : freqDist.keySet())
            System.out.println("Number " + i + " has frequency " +
                    freqDist.get(i));
        System.out.println("=======");

        Map<Integer, Integer> groupedFreqDist = new HashMap<>();
        /*
        for (int x :sample) {
            if (x >= 0 && x < 10) {
                if (groupedFreqDist.containsKey(0))
                    groupedFreqDist.put(0, groupedFreqDist.get(0) + 1);
                else groupedFreqDist.put(0, 1);
            }
            else if (x >= 10 && x < 20)
            {
                if (groupedFreqDist.containsKey(1))
                    groupedFreqDist.put(1, groupedFreqDist.get(1) + 1);
                else groupedFreqDist.put(1, 1);
            }
            else if (x >= 20 && x < 30)
            {
                if (groupedFreqDist.containsKey(2))
                    groupedFreqDist.put(2, groupedFreqDist.get(2) + 1);
                else groupedFreqDist.put(2, 1);
            }
            else if (x >= 30 && x < 40)
            {
                if (groupedFreqDist.containsKey(3))
                    groupedFreqDist.put(3, groupedFreqDist.get(3) + 1);
                else groupedFreqDist.put(3, 1);
            }
            else if (x >= 40 && x < 50)
            {
                if (groupedFreqDist.containsKey(4))
                    groupedFreqDist.put(4, groupedFreqDist.get(4) + 1);
                else groupedFreqDist.put(4, 1);
            }
            else
            {
                if (groupedFreqDist.containsKey(5))
                    groupedFreqDist.put(5, groupedFreqDist.get(5) + 1);
                else groupedFreqDist.put(5, 1);
            }
        }*/

        for (int i : sample) {
            int temp = 0;
            int slot = i / 10;
            if (groupedFreqDist.containsKey(slot))
                temp = groupedFreqDist.get(slot);
            groupedFreqDist.put(slot, temp + 1);
        }

        for (int i : groupedFreqDist.keySet())
            System.out.println("Number range " + i + " has frequency " +
                    freqDist.get(i));
        System.out.println("=======");





    }

}