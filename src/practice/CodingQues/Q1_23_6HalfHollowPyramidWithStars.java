package practice.CodingQues;

import java.util.Scanner;

public class Q1_23_6HalfHollowPyramidWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            Q1_23_5FullHollowPyramidWithStars.hollowStarsView(size, i);
        }
    }
}
