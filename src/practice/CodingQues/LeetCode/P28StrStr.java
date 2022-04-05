package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class P28StrStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("findNeedle(haystack,needle) = " + findNeedle(s.next(), s.next()));
        s.close();
    }

    private static int findNeedle(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
