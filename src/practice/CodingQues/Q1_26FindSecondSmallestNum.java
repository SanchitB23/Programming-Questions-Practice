package practice.CodingQues;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_26FindSecondSmallestNum {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter Numbers for Array Elements");
        int[] numArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            numArray[i] = scanner.nextInt();
        }
        Arrays.sort(numArray);
        int res, i = 0;
        do {
            i++;
            res = numArray[i];
        } while (numArray[i - 1] == numArray[i]);
        System.out.println("Second smallest number out of " + Arrays.toString(numArray) + " is : " + res);
    }
}
