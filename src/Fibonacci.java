public class Fibonacci {

    public static int fibonacci(int n) {
        int fibN = 0;
        int fibNPlus1 = 1;
        for (int i = 0; i < n; i++) {
            int oldFibN = fibN;
            fibN = fibNPlus1;
            fibNPlus1 = oldFibN + fibNPlus1;
        }
        return fibN;
    }
}