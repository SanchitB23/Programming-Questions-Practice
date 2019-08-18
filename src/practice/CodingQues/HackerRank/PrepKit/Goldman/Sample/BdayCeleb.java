package practice.CodingQues.HackerRank.PrepKit.Goldman.Sample;

import java.util.Scanner;

public class BdayCeleb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt(), sum = 0;
        int[] g = new int[x], k = new int[y];
        for (int i = 0; i < x; i++)
            g[i] = scanner.nextInt();
        for (int i = 0; i < y; i++)
            k[i] = scanner.nextInt();
        for (int j = 0; j < y; j++) {
            sum += k[j];
        }
        for (int i = 0; i < x; i++) {
            if (i < y)
                sum += i;
            else sum += (i * i);
        }
        System.out.println(sum);
    }
}
