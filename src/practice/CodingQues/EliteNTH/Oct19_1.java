package practice.CodingQues.EliteNTH;

import java.util.Scanner;

/* Suyaib
 * Print sum of Unique characters in a given array
 * Given : Amcat
 * Answer: 3 (m+c+t = 3 chars unique)
 * */
public class Oct19_1 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            boolean flag = true;
            for (int j = 0; j < chars.length; j++)
                if (i != j && chars[i] == chars[j]) {
                    flag = false;
                    break;
                }
            if (flag) count++;
        }
        System.out.println(count);
    }
}
