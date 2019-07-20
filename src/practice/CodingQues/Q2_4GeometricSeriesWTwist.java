package practice.CodingQues;
/*		○ Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …
		○ This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series. Write a program to find the Nth term in the series.
		○ The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than value of n th term,no other character / string or message should be written to STDOUT. For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.
        You can assume that N will not exceed 30.
*/

import java.util.Scanner;

public class Q2_4GeometricSeriesWTwist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even, odd, res = 0;
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        for (int i = 0, j = 0, k = 0; i < num; i++) {
            if (i % 2 == 0) {
                even = (int) Math.pow(2, j++);
                res = even;
            }
            if (i % 2 != 0) {
                odd = (int) Math.pow(3, k++);
                res = odd;
            }
        }
        System.out.println(res);
    }
}
