package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class P70ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("climbStairs(new Scanner(System.in).nextInt()) = " + climbStairs(new Scanner(System.in).nextInt()));
    }

    public static int climbStairs(int n) {
        int x, y;
        x = 1;
        y = 1;
        for (int i = 0; i < n - 1; i++) {
            System.out.println(i);
            int temp = x;
            x = x + y;
            y = temp;
        }
        return x;
    }
}
