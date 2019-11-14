package practice.CodingQues.AmazonPrep.OneNoteQues;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an array of N positive integers, print k largest elements from the array.
 * The output elements should be printed in decreasing order.
 * */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            kLargestElements(scanner);
        }
    }

    private static void kLargestElements(Scanner scanner) {
        int size = scanner.nextInt(), numOfLargestElements = scanner.nextInt();
        int[] c = new int[size];
        for (int i = 0; i < size; i++)
            c[i] = scanner.nextInt();
        Arrays.sort(c);
//        System.out.println();
        for (int i = 0; i < numOfLargestElements; i++) {
            System.out.print(c[(size - 1) - i] + " ");
        }
    }
}
