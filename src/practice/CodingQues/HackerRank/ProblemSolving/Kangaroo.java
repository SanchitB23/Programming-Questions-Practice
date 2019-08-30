package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), v1 = scanner.nextInt(), x2 = scanner.nextInt(), v2 = scanner.nextInt();
        System.out.println(kangaroo(x1, v1, x2, v2));
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x2 > x1 && v2 > v1)
            return "NO";
        else for (int i = 0; i < 100000; i++) {
            x1 += v1;
            x2 += v2;
            if (x2 == x1)
                return "YES";
        }
        return "NO";
    }

}
