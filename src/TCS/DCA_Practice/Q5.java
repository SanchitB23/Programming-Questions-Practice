package TCS.DCA_Practice;

import java.util.Scanner;

/*
 * John and Linda are playing a numbers game. John asked Linda to find the number whose square ends with the number itself.
 * The number should be a positive integer. WAP to implement above logic
 */
public class Q5 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sq = n * n;
        if (sq % 10 == n) {
            System.out.println("Correct Number ; " + sq % 10);
        } else System.out.println("no : " + sq % 10);
    }
}
