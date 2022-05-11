package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class P69Sqrt {
    public static void main(String[] args) {
        System.out.println("mySqrt(new Scanner(System.in).nextInt()) = " + mySqrt(new Scanner(System.in).nextInt()));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int start = 1, end = x, mid, mid_sq, res = x;
        while (start <= end) {
            mid = (start + end) / 2;
            mid_sq = mid * mid;
            if (mid_sq == x) return mid;
            if (mid_sq < x) {
                start = mid + 1;
                res = mid;
            } else end = mid - 1;
        }
        return res;
    }
}
