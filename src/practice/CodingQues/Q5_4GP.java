package practice.CodingQues;

import java.util.Scanner;

/*Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.*/
public class Q5_4GP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Cases Number");
        int test_cases = scanner.nextInt();
        printGP(--test_cases, scanner);
    }

    @SuppressWarnings("Duplicates")
    private static void printGP(int i, Scanner scanner) {
        if (i < 0) return;
        System.out.println("Enter First");
        int first = scanner.nextInt();
        System.out.println("Enter Second");
        int second = scanner.nextInt();
        System.out.println("Enter N");
        int n = scanner.nextInt();
        int r = second / first;
        System.out.println((first * Math.pow(r, n - 1)));

        printGP(--i, scanner);
    }
}
