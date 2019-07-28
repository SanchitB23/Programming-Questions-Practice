package practice.CodingQues.UnorderedQuestions;

import java.util.Scanner;

public class SumOfSquaresOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt(), e = scanner.nextInt(), sum = 0;
        for (int i = s; i < e; i++) {
            if (i % 2 != 0)
                sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
