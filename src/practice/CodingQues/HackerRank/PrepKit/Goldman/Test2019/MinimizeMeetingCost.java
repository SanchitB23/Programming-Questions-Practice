package practice.CodingQues.HackerRank.PrepKit.Goldman.Test2019;

import java.util.Scanner;

// TODO: 18-08-2019 Not Done, Wrong Answer
public class MinimizeMeetingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = scanner.nextInt();
        System.out.println(minimizeMeetingCost(n, m, arr));
    }

    private static int minimizeMeetingCost(int n, int m, int[][] costs) {
        int result = 0, north = costs[n - 1][(m - 1) / 2], south = costs[0][(m - 1) / 2], east = costs[(n - 1) / 2][0], west = costs[(n - 1) / 2][m - 1], meet = costs[(n - 1) / 2][(m - 1) / 2];
        /*
         * Harsh goes only west
         * Rahul - North
         * Ankita - East
         * N - South
         * */
        for (int i = m - 1; i >= 0; i--) {
            west += costs[(n - 1) / 2][i];
        }
        for (int i = 0; i < m; i++) {
            east += costs[(n - 1) / 2][i];
        }
        for (int i = n - 1; i >= 0; i--) {
            north += costs[(n - 1) / 2][i];
        }
        for (int i = 0; i < n; i++) {
            south += costs[(n - 1) / 2][i];
        }
        for (int i = m - 1; i < n; i++) {
            west += costs[(n - 1) / 2][i];
        }
        result = south + north + west + east;
        return result;
    }
}
