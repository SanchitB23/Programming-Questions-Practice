/*
    TCS Ninja coding questions – 1

    Consider the below series:

    1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, …

    This series is a mixture of 2 series – all the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order.

    Write a program to find the Nth term in this series.

    The value N is a Positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than the value of Nth term, no other characters/strings or message should be written to STDOUT.

    For example, when N = 14, the 14th term in the series is 17. So only the value 17 should be printed to STDOUT.
*/

package practice.CodingQues;

import java.util.Scanner;

public class FiboPlusPrime {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nth Term");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            getPrime(n / 2);
        }
        if (n % 2 != 0) {
            getFibonacci(n / 2);
        }
    }

    private static void getPrime(int n) {
        int flag, count = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                if (++count == n) {
                    System.out.println(i);
                }
            }
        }
    }

    private static void getFibonacci(int n) {
        int next, t1 = 0, t2 = 1;
        for (int i = 0; i < n; i++) {
            next = t1 + t2;
            t1 = t2;
            t2 = next;
        }
        System.out.println(t1);
    }
}

