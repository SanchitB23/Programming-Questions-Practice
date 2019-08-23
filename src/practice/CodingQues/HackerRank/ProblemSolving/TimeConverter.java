package practice.CodingQues.HackerRank.ProblemSolving;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/time-conversion/problem?h_r=next-challenge&h_v=zen
public class TimeConverter {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 12 hour clock Time ( hh:mm:ssAM/PM)");
        String s = scanner.next(); //hh:mm:ssAM
        System.out.println(timeConversion(s));
    }

    private static String timeConversion(String s) throws ParseException {
        Date date = new SimpleDateFormat("hh:mm:ssa").parse(s);
        return new SimpleDateFormat("HH:mm:ss").format(date);
    }
}
