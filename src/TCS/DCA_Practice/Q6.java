package TCS.DCA_Practice;

import java.util.Scanner;

/*
 * Paul is developing an application for a block game. The block game consists of Number blocks, Uppercase Alphabet blocks,
 * Lowercase alphabet blocks and some Symbols blocks.
 * WAP to help Paul identify the precise category of block*/

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        if (Character.isDigit(x.charAt(0)))
            System.out.println("Number");
        else if (Character.isUpperCase(x.charAt(0)))
            System.out.println("Upper case");
        else if (Character.isLowerCase(x.charAt(0)))
            System.out.println("Upper case");
        else
            System.out.println("Symbol");
        scanner.close();
    }
}
