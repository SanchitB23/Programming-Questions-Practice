package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_22_2FullInvertedPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();

        FullInvertedPyramid(size, false);
    }

    static void FullInvertedPyramid(int size, boolean diamond) {
        int x = diamond ? 1 : 0;
        for (int i = size - x; i >= 1; i--) {
            for (int k = 0; k <= size - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
