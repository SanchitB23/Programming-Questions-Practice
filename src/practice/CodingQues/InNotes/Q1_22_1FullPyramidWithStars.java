package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_22_1FullPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();

        Q1_22_1FullPyramidWithStars.FullPyramid(size);

    }

    static void FullPyramid(int size) {
        for (int i = 1; i <= size; i++) {
            for (int k = size - i; k >= 0; k--) {
                System.out.print(" ");
            }
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
