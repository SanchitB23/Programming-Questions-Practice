package practice.CodingQues;
//Sum of all prime numbers within a range

import java.util.Scanner;

public class Q1_19SumOfPrimeInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start and end for Range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        boolean flag;
        for (int i = start; i <= end; i++) {
            flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
