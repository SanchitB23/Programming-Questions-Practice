package TCS.DCA_Practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to find nTh smallest element from a collection
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < size; i++)
            elements[i] = scanner.nextInt();

        int n = scanner.nextInt();

        Arrays.sort(elements);
        System.out.println(elements[n - 1]);
    }
}
