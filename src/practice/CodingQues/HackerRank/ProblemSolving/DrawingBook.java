package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.Scanner;

// TODO: 09-10-2019  
public class DrawingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPages = scanner.nextInt(), resPageNum = scanner.nextInt();
        System.out.println(pageCount(numPages, resPageNum));
    }

    private static int pageCount(int n, int p) {
        int temp1 = 3434324, temp2 = 3434324, temp3 = 3434324;
        int min;
        if (n % 2 == 0) {
            if (n == p) temp3 = 0;
            else if (n - 1 == p) temp3 = 1;
        }
        if ((n - 1 == p || n == p) && !(n % 2 == 0)) temp1 = 0;
        if (p == 1) temp2 = 0;

        if (temp1 <= temp2 && temp1 <= temp3) min = temp1;
        else min = Math.min(temp2, temp3);

        if (min != 3434324)
            return min;
        else min = 0;

        if (n - p > p - 1)
            for (int i = 1; i < p; i += 2) {
                min++;
            }
        else {
            for (int i = n - 1; i > p; i -= 2) {
                min++;
            }
        }
        return min;
    }
}
