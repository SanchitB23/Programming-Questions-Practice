package practice.CodingQues;

import java.util.Scanner;

//Check positive
//Check prime
public class Q2_2PrimeWTwist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = scanner.nextInt();
        num = check(num, scanner);
        System.out.println(num + " is " + (prime(num) ? "Prime" : "not Prime"));
    }

    private static boolean prime(int num) {
        boolean flag = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    private static int check(int num, Scanner scanner) {
        if (num <= 0) {
            System.out.println("Enter a positive Number");
            num = scanner.nextInt();
            check(num, scanner);
        }
        return num;
    }
}
