package practice.CodingQues;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_6PrimeInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        System.out.println("Input Start and End of Range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start > end)
            System.out.println("Invalid Range");
        for (int i = start; i <= end; i++) {
            if (Q1_5CheckPrime.prime(i)) {
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }
}
