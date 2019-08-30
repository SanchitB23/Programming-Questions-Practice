package practice.CodingQues.InNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_11ArmstrongInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();

        System.out.println("Enter start and end of Range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            ArrayList<Integer> digits = new ArrayList<>();
            int temp = i;
            while (temp != 0) {
                digits.add(temp % 10);
                temp /= 10;
            }
            for (int j : digits) {
                temp += Math.pow(j, digits.size());
            }
            if (temp == i) {
                armstrongNumbers.add(i);
            }
        }
        for (int i : armstrongNumbers)
            System.out.print(i + " ");
    }
}
