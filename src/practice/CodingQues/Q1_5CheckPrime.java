package practice.CodingQues;

import java.util.Scanner;

public class Q1_5CheckPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("prime(x) = " + prime(x));
    }

    static boolean prime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
