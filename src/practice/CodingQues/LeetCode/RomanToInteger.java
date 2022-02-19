package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt(new Scanner(System.in).next()));
    }

    private static int romanToInt(String s) {
        s = s.toUpperCase();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) < s.length())
                if ((s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) || (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) || (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))) {
                    int x = getRomanToIntVal(s.charAt(i + 1)) - getRomanToIntVal(s.charAt(i));
                    res += x;
                    i++;
                } else res += getRomanToIntVal(s.charAt(i));
            else res += getRomanToIntVal(s.charAt(i));
        }
        return res;
    }

    private static int getRomanToIntVal(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
