package practice.CodingQues.HackerRank;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    private static String regex = "^[aA-zZ]\\w{7,29}$";
    public static final String regularExpression = regex;
}


public class PatternSyntaxChecker {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}