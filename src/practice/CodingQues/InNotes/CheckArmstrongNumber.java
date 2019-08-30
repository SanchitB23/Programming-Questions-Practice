package practice.CodingQues.InNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        ArrayList<Integer> digits = new ArrayList<>();

        while (temp != 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        for (int i : digits) {
            temp += Math.pow(i, digits.size());
        }
        System.out.println(num + (temp == num ? " is an Armstrong Number" : " is not an Armstrong Number"));
    }
}
