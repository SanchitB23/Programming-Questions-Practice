package TCS.DCA_Practice;

/*
Given a string str, which consists of only 3 letters representing the Color (H) Hue, (S) Saturation, (L) Lightness, called HSL Colors.
The task is to count the occurrence of ordered triplets "H,S,L" in a given string and give this count as the output

Example 1:
Input - HHSL
Output - 2

Explanation:
Str = HHSL, Count of occurrence of ordered triplet is 2
The 1st combination is H of 0 index position, S of 2nd index and L of 3rd.
The 2nd combination is H of 1st index position, S of 2nd and L of 3rd.
So count is 2 triplets
*/

import java.util.Scanner;

public class Q2ExamApril2021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(outputFunc(str));
    }

    private static int outputFunc(String str) {
        int H = 0, res = 0, L = 0, len = str.length();
        for (int j = 0; j < len; j++)
            if (str.charAt(j) == 'L')
                L++;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'L') L--;
            if (str.charAt(i) == 'H') H++;
            if (str.charAt(i) == 'S') res += H * L;
        }
        return res;
    }
}
