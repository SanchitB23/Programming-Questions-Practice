package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(breakingRecords(arr)[0] + " " + breakingRecords(arr)[1]);
    }

    private static int[] breakingRecords(int[] scores) {
        int[] res = new int[2];
        int max = scores[0], min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
                res[1]++;
            }
            if (scores[i] > max) {
                max = scores[i];
                res[0]++;
            }
        }
        return res;
    }
}
