package practice.CodingQues;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_2SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int temp;
        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(arr));
    }
}
