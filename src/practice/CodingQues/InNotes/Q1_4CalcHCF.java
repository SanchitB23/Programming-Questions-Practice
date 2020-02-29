package practice.CodingQues.InNotes;

import java.util.Scanner;

//Calculate HCF or GCD
public class Q1_4CalcHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1 and n2");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(" hcf OLD = " + oldApproach(n1, n2));
        System.out.println(" hcf EUCLID = " + euclidAlgorithm(n1, n2));
    }

    private static int euclidAlgorithm(int a, int b) {
        return b == 0 ? a : euclidAlgorithm(b, a % b);
    }

    private static int oldApproach(int n1, int n2) {
        int hcf = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        return hcf;
    }
}
