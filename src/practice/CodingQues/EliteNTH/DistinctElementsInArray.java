package practice.CodingQues.EliteNTH;

import java.util.Scanner;

public class DistinctElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j]) break;
            if (i == j) System.out.println(arr[i]);
        }
    }
}
