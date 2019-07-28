package practice.CodingQues.UnorderedQuestions;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        for (int i = 1, k = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
