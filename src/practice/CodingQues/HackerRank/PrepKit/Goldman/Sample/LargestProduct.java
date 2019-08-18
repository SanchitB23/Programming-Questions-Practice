package practice.CodingQues.HackerRank.PrepKit.Goldman.Sample;

import java.util.Scanner;

public class LargestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(maxProduct(n));
    }

    private static int maxProduct(int N) {
        int MAX = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if ((i + j) == N && (i * j) > MAX || (i == 1 && j == 1))
                    MAX = (i * j);
            }
        }
        return MAX;
    }
}
