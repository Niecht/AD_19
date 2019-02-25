package e1;

public class FiboDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long a = Fibonacci.fiboRec1(10);
        long stopTime = System.currentTimeMillis();
        System.out.println("Result: " + a + " Runntime: " + (stopTime - startTime));
        long startTime1 = System.currentTimeMillis();
        long b = Fibonacci.fiboRec2(50);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Result: " + b + " Runntime: " + (stopTime1 - startTime1));
        long startTime2 = System.currentTimeMillis();
        long c = Fibonacci.fiboIter(50);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Result: " + c + " Runntime: " + (stopTime2 - startTime2));
    }
}
