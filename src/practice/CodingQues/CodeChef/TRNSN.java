package practice.CodingQues.CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class TRNSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] != a[i]) c++;
        }
        System.out.println(c);
    }
}
