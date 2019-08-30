package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q2_1LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an year");
        int year = scanner.nextInt();
        if (year % 400 == 0) System.out.println("leap year");
        else if (year % 4 == 0 && year % 100 != 0) System.out.println("Leap year");
        else System.out.println("Not leap year");
    }
}
