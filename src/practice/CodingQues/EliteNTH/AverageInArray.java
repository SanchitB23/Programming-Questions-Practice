package practice.CodingQues.EliteNTH;

import java.util.Arrays;
import java.util.Scanner;

public class AverageInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println((int) Arrays.stream(arr).average().orElse(Double.NaN));
//        System.out.println(Arrays.stream(arr).sum());
    }
}
