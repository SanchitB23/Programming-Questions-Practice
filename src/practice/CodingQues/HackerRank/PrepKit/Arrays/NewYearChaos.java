package practice.CodingQues.HackerRank.PrepKit.Arrays;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class NewYearChaos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        do {
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++)
                arr[i] = scanner.nextInt();
            minimumBribes(arr);

            testCases--;
        } while (testCases != 0);
    }

    private static void minimumBribes(int[] q) {

    }
}
