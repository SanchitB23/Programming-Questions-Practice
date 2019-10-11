package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.Scanner;

public class DayOfProgrammer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(dayOfProgrammer(year));
    }

    private static String dayOfProgrammer(int year) {
        String res;
        int temp = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? 244 : 243;
        if (year < 1917)
            temp++;
        if (year == 1711) temp--;
        res = Integer.toString(256 - temp);
        res = res.concat(".09." + year);
        return res;
    }
}
