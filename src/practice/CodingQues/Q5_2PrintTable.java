package practice.CodingQues;

import java.util.Scanner;

public class Q5_2PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Cases Number");
        int test_cases = scanner.nextInt();
        printTable(--test_cases, scanner);
    }

    private static void printTable(int test_cases, Scanner scanner) {
        if (test_cases < 0) return;

        System.out.println("Enter Number for Table");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.print(num * i + " ");
        System.out.println();
        printTable(--test_cases, scanner);
    }
}
