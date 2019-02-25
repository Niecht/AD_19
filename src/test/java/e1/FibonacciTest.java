package e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFiboRec1Zero() {
        assertEquals(Fibonacci.fiboRec1(0),0);
    }

    @Test
    void testFivoRec11() {
        assertEquals(Fibonacci.fiboRec1(1),1);
    }

    @Test
    void testFiboRec9(){
        assertEquals(Fibonacci.fiboRec1(9),34);
    }
}