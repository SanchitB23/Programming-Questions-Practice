package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_9StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        boolean flag = true;
        for (int i = 0; i <= string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
