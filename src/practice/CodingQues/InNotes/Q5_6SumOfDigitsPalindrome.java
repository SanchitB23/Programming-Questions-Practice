package practice.CodingQues.InNotes;

import java.util.ArrayList;
import java.util.Scanner;

//Write a program to check if the sum of digits of a given number N is a palindrome number or not.
public class Q5_6SumOfDigitsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Cases Number");
        int test_cases = scanner.nextInt();
        sumOfDigitsPalindrome(--test_cases, scanner);
    }

    private static void sumOfDigitsPalindrome(int test_cases, Scanner scanner) {
        if (test_cases < 0) return;
        System.out.println("Enter Number");
        int num1 = scanner.nextInt(), sum = 0;
        ArrayList<Integer> digitsOfSum = new ArrayList<>();
        while (num1 != 0) {
            sum += (num1 % 10);
            num1 /= 10;
        }
        while (sum != 0) {
            digitsOfSum.add(sum % 10);
            sum /= 10;
        }
        System.out.println(Q1_8NumPalindrome.palindrome(digitsOfSum) ? "Yes" : "No");

        sumOfDigitsPalindrome(--test_cases, scanner);
    }
}
