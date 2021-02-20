package practice.CodingQues.InNotes;

import java.util.ArrayList;
import java.util.Scanner;

import static practice.CodingQues.InNotes.Q1_29FactorsOfANumber.calcFactors;
import static practice.CodingQues.InNotes.Q1_30PrimeFactorsOfANumber.calcPrimeFactors;

public class Q1_28CheckIfNumberIsSemiPrimeOrNot {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).next());
        ArrayList<Integer> primeFactors = calcPrimeFactors(calcFactors(num));
        System.out.println(checkSemiPrime(primeFactors, num));
        System.out.println(getSemiPrimes(primeFactors));
    }

    private static boolean checkSemiPrime(ArrayList<Integer> primeFactors, int num) {
        for (Integer e1 :
                primeFactors)
            for (Integer e2 :
                    primeFactors)
                if (e1 * e2 == num) return true;
        return false;
    }

    public static ArrayList<Integer> getSemiPrimes(ArrayList<Integer> primeFactors) {
        ArrayList<Integer> semiPrimes = new ArrayList<>();
        for (Integer e1 :
                primeFactors)
            for (Integer e2 :
                    primeFactors) {
                if (e1.equals(e2)) continue;
                int prod = e1 * e2;
                if (!semiPrimes.contains(prod)) semiPrimes.add(prod);
            }
        return semiPrimes;
    }
}
