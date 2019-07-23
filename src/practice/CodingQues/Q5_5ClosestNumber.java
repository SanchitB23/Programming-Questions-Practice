package practice.CodingQues;
/*
 * Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M.
 * If there are more than one such number, then output the one having maximum absolute value.
 * */

import java.util.Scanner;

public class Q5_5ClosestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Cases Number");
        int test_cases = scanner.nextInt();
        closestNumber(--test_cases, scanner);
    }

    private static void closestNumber(int test_cases, Scanner scanner) {
        if (test_cases < 0) return;
        System.out.println("Enter 2 Numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for (int j = num1 + 1, i = num1 - 1; ; j++, i--) {
            if (i % num2 == 0) {
                System.out.println(i);
                break;
            } else if (j % num2 == 0) {
                System.out.println(j);
                break;
            }
        }
        closestNumber(--test_cases, scanner);
    }
}
