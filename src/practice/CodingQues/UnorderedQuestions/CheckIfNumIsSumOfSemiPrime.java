package practice.CodingQues.UnorderedQuestions;

import java.util.ArrayList;
import java.util.Scanner;

import static practice.CodingQues.InNotes.Q1_28CheckIfNumberIsSemiPrimeOrNot.getSemiPrimes;
import static practice.CodingQues.InNotes.Q1_29FactorsOfANumber.calcFactors;
import static practice.CodingQues.InNotes.Q1_30PrimeFactorsOfANumber.calcPrimeFactors;

public class CheckIfNumIsSumOfSemiPrime {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).next());
        ArrayList<Integer> semiPrimes = getSemiPrimes(calcPrimeFactors(calcFactors(num)));
        System.out.println(
                checkSumOfSemiPrime(semiPrimes, num) ? "Yes" : "NO"
        );
    }

    private static boolean checkSumOfSemiPrime(ArrayList<Integer> semiPrimes, int num) {
        for (Integer e1 :
                semiPrimes) {
            for (Integer e2 :
                    semiPrimes) {
                if (e1 + e2 == num) return true;
            }
        }
        return false;
    }
}
