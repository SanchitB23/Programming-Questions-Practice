package practice.CodingQues;

import java.util.Scanner;

public class Q1_12FiboUptoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit, t1 = 0, t2 = 1, next = t1 + t2;
        limit = scanner.nextInt();

        for (int i = 0; i < limit; i++) {
            System.out.print(t1 + " ");
            t1 = t2;
            t2 = next;
            next = t1 + t2;
        }
    }
}
