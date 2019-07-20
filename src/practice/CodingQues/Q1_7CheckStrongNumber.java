package practice.CodingQues;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.
 */
public class Q1_7CheckStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<>();
        int sum = 0;

        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        int num_copy = num;
        while (num != 0) {
            int x = num % 10;
            num /= 10;
            sum += fact(x);
        }
        System.out.println(num_copy + " is a " + (sum == num_copy ? "Strong Number" : "Not a Strong Number"));
    }

    private static int fact(int x) {
        if (x <= 1) {
            return x;
        }
        return x * fact(--x);
    }
}
