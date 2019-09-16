package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: 06-09-2019 Donno how to Apply permutation in a Program
public class BirthdayChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squares = scanner.nextInt();
//        int[] numInSquares = new int[squares];
        List<Integer> numInSquares = new ArrayList<>();
        for (int i = 0; i < squares; i++) {
            numInSquares.add(scanner.nextInt());
        }
        int date = scanner.nextInt(), month = scanner.nextInt();
        System.out.println(birthday(numInSquares, date, month));
    }

    private static int birthday(List<Integer> s, int d, int m) {
        int numOfWays = 0;
        for (int i = 0; i < s.size(); i++) {
            int temp = 0;
            for (int j = 0; j < m && (i + j) < s.size(); j++) {
                temp += s.get(i + j);
            }
            if (temp == d)
                numOfWays++;
        }
        return numOfWays;
    }
}
