package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(), k = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(divisibleSumPairs(size, arr, k));
    }

    private static int divisibleSumPairs(int n, int[] ar, int k) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int temp1 = ar[i], temp2 = ar[j];
                if ((temp1 + temp2) % k == 0)
                    sum++;
            }
        return sum;
    }
}
