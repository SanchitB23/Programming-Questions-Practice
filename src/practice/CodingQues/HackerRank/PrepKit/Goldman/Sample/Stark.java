package practice.CodingQues.HackerRank.PrepKit.Goldman.Sample;

import java.util.Scanner;

public class Stark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long z = scanner.nextLong();
        System.out.println(findMaxWeapons(x, y, z));
    }

    private static long findMaxWeapons(long X, long Y, long Z) {
        long res;
        if (Y <= X) {
            X = Y;
        }
        res = Math.abs(Z - X);
        return res;
    }
}
