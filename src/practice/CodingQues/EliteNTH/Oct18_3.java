package practice.CodingQues.EliteNTH;

import java.util.Scanner;

// Binary to Decimal and vice versa - Chaitany and Suyaib
public class Oct18_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isD = scanner.nextBoolean();
        System.out.println(
                isD
                        ? Integer.toBinaryString(num) // or Integer.toString(num,2);
                        : Integer.parseInt(Integer.toString(num), 2)
        );
    }
}
