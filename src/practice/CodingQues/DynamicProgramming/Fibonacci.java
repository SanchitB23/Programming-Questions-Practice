package practice.CodingQues.DynamicProgramming;

/*
 * Will be doing in 3 ways
 * Recursive
 * Dynamic Programming -
 *   Memoization
 *   Tabulation
 */

import java.util.Scanner;

public class Fibonacci {
    private static final int MAX = 100;
    private static final int NIL = -1;
    private static final int[] lookup = new int[MAX];

    public static void main(String[] args) {
        System.out.println("Enter nTh Number");
        int n = new Scanner(System.in).nextInt();

        long startRecTime = System.nanoTime();
        int rec = fibonacciRecursive(n);
        long endRecTime = System.nanoTime();
        System.out.println("Recursive Approach - \n Ans - " + rec + "\n Time Taken - " + (endRecTime - startRecTime));

        setLookupInit();
        long startMemTime = System.nanoTime();
        int mem = fibonacciMemoization(n);
        long endMemTime = System.nanoTime();
        System.out.println("Memoization Approach - \n Ans - " + mem + "\n Time Taken - " + (endMemTime - startMemTime));

        long startTabTime = System.nanoTime();
        int tab = fibonacciTabular(n);
        long endTabTime = System.nanoTime();
        System.out.println("Tabular Approach - \n Ans - " + tab + "\n Time Taken - " + (endTabTime - startTabTime));


    }

    private static void setLookupInit() {
        for (int i = 0; i < MAX; i++) {
            lookup[i] = NIL;
        }
    }

    private static int fibonacciMemoization(int n) {
        if (lookup[n] == NIL) {
            if (n <= 1) lookup[n] = n;
            else lookup[n] = fibonacciMemoization(n - 1) + fibonacciMemoization(n - 2);
        }
        return lookup[n];
    }

    private static int fibonacciTabular(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    private static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
