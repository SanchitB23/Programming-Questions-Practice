package practice.CodingQues.UnorderedQuestions;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        int len = new Scanner(System.in).nextInt();
        len++;
        int[][] arr = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = len; j > i; j--) System.out.print(" ");
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
