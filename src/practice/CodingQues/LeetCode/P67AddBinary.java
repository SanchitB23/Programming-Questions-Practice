package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class P67AddBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println("addBinary(a,b) = " + addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        StringBuilder as = new StringBuilder(a);
        StringBuilder bs = new StringBuilder(b);
        int da, db;
        as.reverse();
        bs.reverse();
        for (int i = 0; i < Math.max(as.length(), bs.length()); i++) {
            da = i < a.length() ? Integer.parseInt(String.valueOf(as.charAt(i))) : 0;
            db = i < b.length() ? Integer.parseInt(String.valueOf(bs.charAt(i))) : 0;
            int total = da + db + carry;
            String ch = String.valueOf((total % 2));
            res.insert(0, ch);
            carry = total / 2;
        }
        if (carry > 0) res = new StringBuilder("1" + res);
        return res.toString();
    }
}
