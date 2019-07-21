package practice.CodingQues;

import java.util.Scanner;

public class Q1_23_5FullHollowPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int k = size - i; k >= 0; k--) {
                System.out.print(" ");
            }
            hollowStarsView(size, i);
        }
    }

    static void hollowStarsView(int size, int i) {
        for (int j = 1; j <= i; j++) {
            if (i == size) System.out.print("* ");
            else if (j == i) System.out.print("* ");
            else if (j == 1) System.out.print("* ");
            else System.out.print("  ");
        }
        System.out.println();
    }
}
