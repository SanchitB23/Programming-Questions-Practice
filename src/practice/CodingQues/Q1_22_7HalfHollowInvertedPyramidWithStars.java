package practice.CodingQues;

import java.util.Scanner;

public class Q1_22_7HalfHollowInvertedPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
