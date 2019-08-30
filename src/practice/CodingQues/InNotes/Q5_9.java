package practice.CodingQues.InNotes;

import java.util.Scanner;

//Given two numbers A and B, find Kth digit from right of A^B.
public class Q5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Cases Number");
        int test_cases = scanner.nextInt();
        findTermFromApowB(--test_cases, scanner);
    }

    private static void findTermFromApowB(int test_cases, Scanner scanner) {
        if (test_cases < 0) return;

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 1, temp = 0;
        int res = (int) Math.pow(a, b);

        while (i == k) {
            temp = res % 10;
            res /= 10;
            i++;
        }
        System.out.println(temp);

        findTermFromApowB(test_cases, scanner);
    }
}
