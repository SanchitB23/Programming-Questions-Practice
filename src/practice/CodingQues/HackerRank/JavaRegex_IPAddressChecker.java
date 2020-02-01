package practice.CodingQues.HackerRank;

import java.util.Scanner;

public class JavaRegex_IPAddressChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            boolean match = IP.matches(new MyRegex().pattern);
            System.out.println(match);
        }

    }
}

class MyRegex {

    String rangeChecker = "(\\d{1,2}|([01])\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = rangeChecker + "\\." + rangeChecker + "\\." + rangeChecker + "\\." + rangeChecker;
}