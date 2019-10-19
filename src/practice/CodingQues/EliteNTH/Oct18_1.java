package practice.CodingQues.EliteNTH;

import java.util.Scanner;

/* Adeeba
 * Take 2 inputs: A and B
 * Find Nearest Prime Number bigger than A = p1 (A<p1<<B)
 * Find Nearest Prime Number smaller than B = p2 (A<<p2<B)
 *  Print A+B
 */
public class Oct18_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt(), end = scanner.nextInt(), p1 = 0, p2 = 0;
        for (int i = start; i <= end; i++)
            if (prime(i)) {
                p1 = i;
                break;
            }
        for (int i = end; i >= start; i--)
            if (prime(i)) {
                p2 = i;
                break;
            }
        System.out.println(p1 + p2);
        scanner.close();
    }

    private static boolean prime(int num) {
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }
}
