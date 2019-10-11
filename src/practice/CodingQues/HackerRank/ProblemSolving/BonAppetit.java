package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bill = new ArrayList<Integer>();
        int n = scanner.nextInt(), k = scanner.nextInt();
        for (int i = 0; i < n; i++)
            bill.add(scanner.nextInt());
        int b = scanner.nextInt();
        bonAppetit(bill, k, b);
    }

    private static void bonAppetit(List<Integer> bill, int k, int b) {
        int sumAll = bill.stream().mapToInt(Integer::intValue).sum();
        int sumK = (sumAll - bill.get(k)) / 2;
        System.out.println(
                sumK == b ? "Bon Appetit" : Math.abs(b - sumK)
        );
    }
}
