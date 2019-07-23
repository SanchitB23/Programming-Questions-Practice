package practice.CodingQues;

import java.util.Scanner;

/*
* Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series.

Input:
The first line of input contains an integer, the number of test cases T. T testcases follow. Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). In the second line of every testcase it contains of an integer N.

Output:
For each testcase, in a new line, print the Nth term of the Arithmetic Progression.
* */
public class Q5_3AP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Cases Number");
        int test_cases = scanner.nextInt();
        printAP(--test_cases, scanner);
    }

    private static void printAP(int i, Scanner scanner) {
        if (i < 0) return;
        System.out.println("Enter First");
        int first = scanner.nextInt();
        System.out.println("Enter Second");
        int second = scanner.nextInt();
        System.out.println("Enter N");
        int n = scanner.nextInt();
        int d = second - first;
        System.out.println((first + ((n - 1) * d)));

        printAP(--i, scanner);
    }
}
