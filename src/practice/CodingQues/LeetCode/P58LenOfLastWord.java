package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class P58LenOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(new Scanner(System.in).nextLine()));
    }

    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
