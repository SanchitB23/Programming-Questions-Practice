package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_23_1FullPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = scanner.nextInt();
        int num = 1;
        for (int i = 0; i < size; i++) {
            for (int k = size - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
    }
}
