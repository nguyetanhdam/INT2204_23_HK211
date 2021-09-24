import java.util.Scanner;

//public class Solution
public class Fibonacci {
    /**
     * tinh fibo thu n.
     */
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        if (n > 92) {
            return Long.MAX_VALUE;
        }
        long a = 0;
        long b = 1;
        long c = 0;
        for (long i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    /**
     * in ra.
     */
    public static void main(String[] args) {
        // Solution s = new Solution();
        Fibonacci s = new Fibonacci();
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long res = (long) s.fibonacci(n);
        System.out.println(res);
    }
} 