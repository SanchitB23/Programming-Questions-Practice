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

    private static int birthday(List<Integer> s, int date, int m) {
        int numOfWays = 0;
        return numOfWays;
    }
}
