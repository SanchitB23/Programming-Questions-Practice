package practice.CodingQues.EliteNTH;

import java.util.Scanner;

public class AdditionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                A[i][j] = scanner.nextInt();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                B[i][j] = scanner.nextInt();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}
