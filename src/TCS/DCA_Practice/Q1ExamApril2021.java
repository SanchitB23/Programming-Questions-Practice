package TCS.DCA_Practice;

/*
Given a String S, which starts with an integer number followed by some letters, The task is to check if the length, of the
input  string(excluding the number at the beginning) is equal to the number or not, Print "TRUE <Actual length of string>",
if equal; otherwise print "FALSE <Actual length of string>"

Exclude the number from the beginning of the text then find length
Example : S = "5THINK" answer is TRUE 5 as think 5 letters
*/

import java.util.Scanner;

public class Q1ExamApril2021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(outputFunc(str));
        s.close();
    }

    private static String outputFunc(String str) {
        String newStr = "";
        String numStr = "";

        for (char c :
                str.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr = numStr.concat(Character.toString(c));
            } else if (Character.isAlphabetic(c)) {
                newStr = newStr.concat(Character.toString(c));
            } else System.out.println("What's this?" + c);
        }
        System.out.println(
                "Number: " + numStr + "\n" +
                        "String: " + newStr
        );
        if (Integer.parseInt(numStr) == newStr.length()) {
            return "TRUE " + newStr.length();
        } else
            return "FALSE " + newStr.length();
    }
}