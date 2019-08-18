package practice.CodingQues.HackerRank.PrepKit.WarmUp;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        long num = scanner.nextLong(), sCount = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'a')
                sCount++;
        }
        long count = ((num / chars.length) * sCount);
        int rem = (int) (num % chars.length);
        for (int i = 0; i < rem; i++) {
            if (chars[i] == 'a')
                count++;
        }
        System.out.println(count);
    }
}
