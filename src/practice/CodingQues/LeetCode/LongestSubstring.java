package practice.CodingQues.LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(new Scanner(System.in).next()));
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            ArrayList<Character> letters = new ArrayList<>();
            int c = 0;
            for (int j = i; j < s.length(); j++) {
                if (letters.contains(s.charAt(j))) {
                    break;
                }
                letters.add(s.charAt(j));
                c++;
            }
            System.out.println(letters.toString() + c + count);
            if (c > count) count = c;
        }
        return count;
    }
}
