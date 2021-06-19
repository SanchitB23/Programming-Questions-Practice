package practice.CodingQues.DynamicProgramming;

/*
Given 3 numbers {1, 3, 5}, we need to tell
the total number of ways we can form a number 'N'
using the sum of the given three numbers.
https://www.geeksforgeeks.org/solve-dynamic-programming-problem/
*/

import java.util.Scanner;

public class Q1 {
    //    Adding Memoization
    public static int[] dp;

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        dpInit(n);
        System.out.println(solveWithMem(n));
        System.out.println(dp[n]);
    }

    //Exponential Approach
    private static int solve(int n) {
//        base case
        if (n < 0) return 0;
        else if (n == 0) return 1;

        return solve(n - 1) + solve(n - 5) + solve(n - 3);
    }

    private static void dpInit(int n) {
        dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
        }
    }

    private static int solveWithMem(int n) {
//        base case
        if (n < 0) return 0;
        else if (n == 0) return 1;

//        check if already Calculated
        if (dp[n] != -1)
            return dp[n];

        return dp[n] = solveWithMem(n - 1) + solveWithMem(n - 5) + solveWithMem(n - 3);
    }

}
