package practice.CodingQues.InNotes;

import java.util.ArrayList;
import java.util.Scanner;

import static practice.CodingQues.InNotes.Q1_29FactorsOfANumber.calcFactors;
import static practice.CodingQues.InNotes.Q1_5CheckPrime.prime;

/*
 * First Calculate Factors
 * Then check what factors are prime -> Answer
 * */

public class Q1_30PrimeFactorsOfANumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).next());
        ArrayList<Integer> factors = calcFactors(num);
        System.out.println(calcPrimeFactors(factors));
    }

    public static ArrayList<Integer> calcPrimeFactors(ArrayList<Integer> factors) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for (Integer factor :
                factors)
            if (prime(factor) && factor != 1) primeFactors.add(factor);
        return primeFactors;
    }
}
