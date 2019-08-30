package practice.CodingQues.InNotes;

import java.util.Scanner;

public class Q1_4_2CalcLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1 and n2");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int hcf = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 || n2 % i == 0)
                hcf = i;
        }
        System.out.println(" LCM = " + hcf);
    }

}
