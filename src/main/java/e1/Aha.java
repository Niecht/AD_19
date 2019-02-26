package e1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aha {
    private static Logger LOG = LogManager.getLogger(Aha.class);
    private static int calls;

    public static void task(final int n){
        int calls;
        task1(); task1(); task1(); task1(); // T ~ 4
        for (int i = 0; i < n; i++){
            task2(); task2(); task2(); // T ~ n*3
            for (int j = 0; j < n; j++){
                task3(); task3(); // T ~ n*n*2
            }
        }
        LOG.info("Number of tasks executed: " + Aha.calls);
    }

    public int getCalls() {
        return calls;
    }

    private static void task1(){
        Aha.calls++;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void task2(){
        Aha.calls++;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void task3(){
        Aha.calls++;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}