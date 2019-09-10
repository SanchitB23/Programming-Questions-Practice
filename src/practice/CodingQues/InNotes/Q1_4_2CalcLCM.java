package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_4_2CalcLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1 and n2");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(" LCM = " + lcm(n1, n2));
    }

    private static int lcm(int n1, int n2) {
        return (n1 * n2) / gcd(n1, n2);
    }

    private static int gcd(int n1, int n2) {
        int hcf = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        return hcf;
    }

}
