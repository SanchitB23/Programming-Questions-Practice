package practice.CodingQues;

import java.util.Scanner;

public class Q1_22_3HalfPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print("*");
                if (j != i)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
