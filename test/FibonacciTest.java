import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void given_zero_returns_zero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void given_one_returns_one() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void ten_first_fibonacci() {
        // There are better (advanced) ways to do this
        int[] fibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int i = 0; i < fibonacci.length; i++) {
            assertEquals(fibonacci[i], Fibonacci.fibonacci(i));
        }
    }
}