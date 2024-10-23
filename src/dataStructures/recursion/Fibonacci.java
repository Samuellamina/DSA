package dataStructures.recursion;

public class Fibonacci {
    public static int fibonacci(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number " + n + " is: " + fibonacci(n));
    }
}

