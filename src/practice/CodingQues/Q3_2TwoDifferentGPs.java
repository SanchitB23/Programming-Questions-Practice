/*
    Given a series whose even term creates a separate geometric series and odd term creates another geometric series. Write a program to generate such series.
    For example,
    1, 1, 2, 2, 4, 4, 8, 8, 16, 16,……
*/

package practice.CodingQues;

import java.util.Scanner;

public class Q3_2TwoDifferentGPs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        System.out.println("Enter R1");
        int r1 = scanner.nextInt();
        System.out.println("Enter R2");
        int r2 = scanner.nextInt();

        for (int i = 0, j = 0, k = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println((int) Math.pow(r1, j++));
            }
            if (i % 2 != 0) {
                System.out.println((int) Math.pow(r2, k++));
            }
        }
    }
}
