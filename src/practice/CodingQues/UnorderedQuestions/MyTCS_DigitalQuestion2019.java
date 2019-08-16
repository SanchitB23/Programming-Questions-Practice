package practice.CodingQues.UnorderedQuestions;

import java.util.Scanner;

/*
 * Display number of prime numbers(count) from Input1 to Input2
 * where count++ if x == prime && x+6 ==prime
 * there it called sexy primes(six in Latin)
 * Constraints: TLE: >2sec
 */

public class MyTCS_DigitalQuestion2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt(),
                secondNum = scanner.nextInt();

        boolean[] res = soe(secondNum);
        for (int i = firstNum; i <= secondNum; i++) {
            if (res[i])
                System.out.print(i + " ");
        }
    }

    private static boolean[] soe(int secondNum) {
        boolean[] arr = new boolean[secondNum + 1];
        for (int i = 0; i <= secondNum; i++) {
            arr[i] = true;
        }
        for (int p = 2; p * p <= secondNum; p++) {
            if (arr[p]) {
                for (int i = p * p; i <= secondNum; i += p) {
                    arr[i] = false;
                }
            }
        }
        return arr;
    }
}
