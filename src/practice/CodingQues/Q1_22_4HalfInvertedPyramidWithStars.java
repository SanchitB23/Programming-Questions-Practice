package practice.CodingQues;

import java.util.Scanner;

public class Q1_22_4HalfInvertedPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();

        for (int i = size; i >= 1; i--) {
            Q1_22_5FullHollowPyramidWithStars.hollowStarsView(size, i);
        }
    }
}
