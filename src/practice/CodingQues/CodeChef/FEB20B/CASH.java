package practice.CodingQues.CodeChef.FEB20B;

import java.util.Scanner;

public class CASH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.next());
        while (tests > 0) {
            int n = Integer.parseInt(scanner.next()), k = Integer.parseInt(scanner.next());
            int[] a = new int[n];
            int[] c = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(scanner.next());
            for (int i = 0; i < n; i++) c[i] = a[i] % k;
            for (int x : c) sum += x;
            if (sum > k) sum %= k;
            System.out.println(sum);
            tests--;
        }
    }
}
