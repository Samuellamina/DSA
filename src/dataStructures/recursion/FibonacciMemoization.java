package dataStructures.recursion;

import java.util.HashMap;

public class FibonacciMemoization {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo.containsKey(n)) {
            return memo.get(n); // Return already computed result
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result); // Save result for future use
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number " + n + " is: " + fibonacci(n));
    }
}
