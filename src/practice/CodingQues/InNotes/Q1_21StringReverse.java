package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_21StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        System.out.println("\nApproach 1");

        for (int i = string.length() - 1; i >= 0; --i) {
            System.out.print(string.charAt(i));
        }
        System.out.println("\n\nApproach 2");
        System.out.println(stringBuilder.reverse().toString());
    }
}
