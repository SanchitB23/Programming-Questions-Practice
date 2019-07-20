package practice.CodingQues;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_8NumPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<>();
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        while (num != 0) {
            digits.add(num % 10);
            num /= 10;
        }
//        Collections.reverse(digits);
        System.out.println(palindrome(digits));
    }

    private static boolean palindrome(ArrayList<Integer> digits) {
        for (int i = 0; i < digits.size() / 2; i++) {
            if (!digits.get(i).equals(digits.get(digits.size() - i - 1)))
                return false;
        }
        return true;
    }
}
