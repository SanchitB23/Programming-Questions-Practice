package practice.CodingQues;


import java.util.Scanner;

public class Q1_13BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double binaryNum = scanner.nextDouble();
        int decimalNum = 0, i = 0;
        while (binaryNum != 0) {
            int temp = (int) (binaryNum % 10);
            binaryNum /= 10;
            decimalNum += (temp * Math.pow(2, i));
            i++;
        }
        System.out.println(decimalNum);
    }
}
