package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_25_1DiamondUsingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int size = scanner.nextInt();
        int num = 1;
        for (int i = 0; i < size; i++) {
//            num = 1;
            for (int k = size - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
        num -= 2;
        for (int i = 1; i < size; i++) {

            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size - i; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num--;
        }
    }
}
