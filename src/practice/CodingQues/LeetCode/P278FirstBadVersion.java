package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class P278FirstBadVersion {
    private static int bad;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        bad = scanner.nextInt();
        System.out.println(firstBadVersion(n));
    }

    private static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    private static boolean isBadVersion(int v) {
        return v >= bad;
    }
}
