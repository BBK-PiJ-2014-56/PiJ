package textloops;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by jimjohn_thornton on 23/02/15.
 */
public class textLoops2 implements Runnable {
    public static final int COUNT = 20;
    private final String name;

    public textLoops2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop:" + name + ", iteration:" + i + ".");
        }
    }

    public static void main(String args[]) {
        System.out.println("USAGE: java TextLoop <mode>");
        System.out.println(" mode 0: without threads");
        System.out.println(" mode 1: with threads");
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
//        if (option ==1|| option ==0){// || (arg.length()!=0 && arg.length()!=(1))) {
//            System.out.println("USAGE: java TextLoop <mode>");
//            System.out.println(" mode 0: without threads");
//            System.out.println(" mode 1: with threads");
//        } else

        if (option == (0)) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new textLoops2("Thread " + i);
                r.run();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Runnable r = new textLoops2("Thread " + i);
                //Thread t = new Thread(r);
                //t.start();
            Executor e = Executors.newFixedThreadPool(5);//ThreadPoolExecutor();
            e.execute(r);
            }
            //e.shutdown();
        }
    }
}
