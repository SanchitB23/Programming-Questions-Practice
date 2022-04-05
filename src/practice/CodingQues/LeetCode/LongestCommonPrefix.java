package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        System.out.println("lcp(strings) = " + lcp(strings));
        scanner.close();
    }

    private static String lcp(String[] strs) {
        int len = Integer.MAX_VALUE;
        for (String s : strs)
            if (len > s.length()) len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) stringBuilder.append(c);
            else break;
        }
        return stringBuilder.toString().length() > 0 ? stringBuilder.toString() : "";
    }
}
//flower flow flight
//dog racecar car