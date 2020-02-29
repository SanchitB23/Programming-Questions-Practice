package practice.CodingQues.UnorderedQuestions;

import java.util.Scanner;

public class SumOfDigitsUntil1DigitLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());
        System.out.println(getSumOfDigits(num));
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum >= 10) {
            sum = getSumOfDigits(sum);
        }
        return sum;
    }
}
///3243