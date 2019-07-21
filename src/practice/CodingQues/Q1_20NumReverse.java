package practice.CodingQues;

import java.util.Scanner;

public class Q1_20NumReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        StringBuilder string = new StringBuilder();
        int num_copy = num;
        while (num_copy > 0) {
            /*
             * Alt approaches:
             *   Straight up printing rn
             *   temp x 10 in next time to change place value and reverse
             * */
            string.append(num_copy % 10);
            num_copy /= 10;
        }
        System.out.println(num + " Reversed Value: " + string.toString());
    }
}
