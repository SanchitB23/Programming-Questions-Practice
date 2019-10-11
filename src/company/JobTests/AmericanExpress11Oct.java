package company.JobTests;
//Done on 11th October

import java.util.Scanner;

public class AmericanExpress11Oct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            for (int j = 1; j <= n; j++)
                System.out.print(series(j) + " ");
            System.out.println();
        }
    }

    private static int series(int num) {
        int res = num;
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                while (num % i == 0)
                    num /= i;
                res -= res / i;
            }
        }
        if (num > 1)
            res -= res / num;
        return res;
    }
}
