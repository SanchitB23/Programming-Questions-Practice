package practice.CodingQues;

import java.util.Scanner;

public class Q1_23_5FullInvertedHollowPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();

        for (int i = size; i >= 1; i--) {
            for (int k = 0; k <= size - i; k++) {
                System.out.print(" ");
            }
            Q1_23_5FullHollowPyramidWithStars.hollowStarsView(size, i);
        }
    }
}
