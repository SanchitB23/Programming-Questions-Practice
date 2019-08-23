package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int[] arrRevSort = new int[size];
        for (int i = 0; i < size; i++) {
            arrRevSort[size - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrRevSort));
        System.out.println(birthdayCakeCandles(arr));
    }

    private static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int[] arrRevSort = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            arrRevSort[ar.length - i - 1] = ar[i];
        }
        int res = 0;
        for (int value : arrRevSort) {
            if (arrRevSort[0] == value)
                res++;
            else break;
        }
        return res;
    }
}
