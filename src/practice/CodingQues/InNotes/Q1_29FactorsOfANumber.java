package practice.CodingQues.InNotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q1_29FactorsOfANumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).next());
        ArrayList<Integer> factors = calcFactors(num);
        System.out.println(Arrays.toString(factors.toArray()));
    }

    public static ArrayList<Integer> calcFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) if (num % i == 0) factors.add(i);
        return factors;
    }
}
