package practice.CodingQues;

import java.util.Scanner;

public class Q1_14DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(Integer.toBinaryString(x));
        //With Algo
        StringBuilder s = new StringBuilder();
        while (x != 0) {
            int temp = x % 2;
            x /= 2;
            s.append(temp);
        }
        System.out.println(s.reverse());
    }
}
