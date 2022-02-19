package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println("Answer : " + lengthOfLongestPalindromeSubstring(new Scanner(System.in).next()));
    }

    private static String lengthOfLongestPalindromeSubstring(String s) {
        String res = "";
        for (int i = 0, n = 1; i < s.length(); ) {
            boolean flag = true;
            String str = "";
            for (int j = i; j < n / 2; j++) {
                if (s.charAt(j) != s.charAt(n - j - 1)) {
                    flag = false;
                    break;
                }
                str = s.substring(i, n);
            }
            if (res.length() < str.length()) res = str;
            if (n >= s.length()) {
                i++;
                n = i + 1;
            } else n++;
        }
        return res;
    }
}