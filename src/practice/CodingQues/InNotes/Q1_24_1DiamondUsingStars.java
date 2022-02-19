package practice.CodingQues.InNotes;

import java.util.Scanner;
//Pattern
public class Q1_24_1DiamondUsingStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();
        Q1_22_1FullPyramidWithStars.FullPyramid(size);
        Q1_22_2FullInvertedPyramidWithStars.FullInvertedPyramid(size, true);
    }
}
