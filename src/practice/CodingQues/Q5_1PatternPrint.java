package practice.CodingQues;

import java.util.Scanner;

/*
You a given a number N. You need to print the pattern for the given value of N.
for N=2 the pattern will be
2 2 1 1
2 1
for N=3 the pattern will be
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

Input Format:
The first line of input is the number of testcases T. The T test cases follow.
The first line of each test case is an integer N.

Output Format:
For each test case, in a new line, print the required pattern in a singleline .
Note : Instead of printing new line print a "$" without quotes.

Your Task:
Since this is a function problem, you don't need to worry about the testcases.
Your task is to complete the function printPat which takes one argument 'N' denoting the length of the pattern.
*/
public class Q5_1PatternPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Cases Number");
        int test_cases = scanner.nextInt();
        printPat(--test_cases, scanner);
    }

    private static void printPat(int test_cases, Scanner scanner) {
        if (test_cases < 0) return;
        System.out.println("Enter n");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = 1; k <= i; k++)
                    System.out.print(j + " ");
            }
            System.out.print("$");
        }
        System.out.println();
        printPat(--test_cases, scanner);
    }
}
