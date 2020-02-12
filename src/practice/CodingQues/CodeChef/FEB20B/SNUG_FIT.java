package practice.CodingQues.CodeChef.FEB20B;

import java.util.Scanner;

public class SNUG_FIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
//        while (t > 0) {
        int n = Integer.parseInt(scanner.next());
        int[] A = new int[n];
        int[] B = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) A[i] = Integer.parseInt(scanner.next());
        for (int i = 0; i < n; i++) B[i] = Integer.parseInt(scanner.next());

        for (int i = 0; i < n; i++) {
            int r = Math.min(A[i], B[i]);
            sum += Math.PI * Math.pow(r, 2);
        }
        System.out.println(sum);
        t--;
//        }
    }
}
