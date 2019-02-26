package e1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FiboDemo {
    private static Logger LOG = LogManager.getLogger(FiboDemo.class);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long a = Fibonacci.fiboRec1(30);
        long stopTime = System.currentTimeMillis();
        LOG.info("Result: " + a + " Runntime: " + (stopTime - startTime));
        long startTime1 = System.currentTimeMillis();
        long b = Fibonacci.fiboRec2(100);
        long stopTime1 = System.currentTimeMillis();
        LOG.info("Result: " + b + " Runntime: " + (stopTime1 - startTime1));
        long startTime2 = System.currentTimeMillis();
        long c = Fibonacci.fiboIter(100);
        long stopTime2 = System.currentTimeMillis();
        LOG.info("Result: " + c + " Runntime: " + (stopTime2 - startTime2));
    }
}
