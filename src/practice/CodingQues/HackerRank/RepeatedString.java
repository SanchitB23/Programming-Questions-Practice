package practice.CodingQues.HackerRank;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int num = scanner.nextInt();
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int x;
            if (i < chars.length)
                x = i;
            else x = i % chars.length;
            stringBuilder.append(chars[x]);
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (stringBuilder.charAt(i) == 'a')
                count++;
        }
        System.out.println(count);
    }
}
