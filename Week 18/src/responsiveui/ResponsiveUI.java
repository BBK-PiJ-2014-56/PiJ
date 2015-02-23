package responsiveui;
import java.util.Scanner;

/**
 * Created by jimjohn_thornton on 23/02/15.
 */
public class ResponsiveUI implements Runnable {
    //    int duration = 0;
//    public ResponsiveUI2 (int duration) {
//        this.duration = duration;
//    }
    private int[] finishedtasks = new int[10];

    private int current = 0;


    public static void main(String[] args) {
        //int[] finishedtasks = new int[10];
        for (int i = 0; i < 14; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the duration (in ms) of task " + i);
            int duration = sc.nextInt();
            Runnable r = new ResponsiveUI(duration,i+1);
            Thread t = new Thread(r);
            t.start();



            //Executor e = Executors.newFixedThreadPool(10);//ThreadPoolExecutor();
            //e.execute(r);
        }
    }
    long mls;
    public ResponsiveUI(long mls,int id){
        this.mls=mls;
        current=id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(mls);
            finishedtasks[current-1] = current;
            System.out.println("finished tasks: " + finishedtasks[current]);
            //current = (Thread.currentThread().getId());

            //if(!Thread.){
            //System.out.println("dead");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //TimerTask timerTask = new ResponsiveUI2();

        //timer.
    }
}
