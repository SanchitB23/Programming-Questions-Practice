package company.JobTests;

import java.util.Scanner;

/*
 * Question : Given n, find the number of pairs(x,y) where both x and y are less than n and HCF of x and y is 1
 * Input  : n -> Integer
 * Output : count -> Integer
 * Solution :  https://www.geeksforgeeks.org/count-pairs-natural-numbers-gcd-equal-given-number/
 * */
public class NagarroJuly2022_3 {
    public static void main(String[] args) {
        System.out.println(pairs(new Scanner(System.in).nextInt()));
    }

    private static int pairs(int value) {
        int res = 0;
        for (int i = 0; i < value; i++) for (int j = 0; j < value; j++) if (gcd(i, j) == 1) res++;
        return res;
    }

    private static int gcd(int i, int j) {
        return j > 0 ? gcd(j, i % j) : i;
    }
}
