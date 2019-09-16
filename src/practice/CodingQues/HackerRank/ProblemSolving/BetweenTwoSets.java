package practice.CodingQues.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// TODO: 04-09-2019 Failing Test Cases
public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA = scanner.nextInt(), sizeB = scanner.nextInt();
//        int[] A = new int[sizeA], B = new int[sizeB];
        List<Integer> A = new ArrayList<>(), B = new ArrayList<>();
        for (int i = 0; i < sizeA; i++) {
            A.add(scanner.nextInt());
        }
        for (int i = 0; i < sizeB; i++) {
            B.add(scanner.nextInt());
        }
        System.out.println(getTotalX(A, B));
    }

    private static int getTotalX(List<Integer> a, List<Integer> b) {
        int total = 0;
        int lcmA = lcm(a);
        int gcdB = gcd(b);
//        System.out.println(lcmA);
//        System.out.println(gcdB);
        Collections.sort(b);
        for (int i = 1; lcmA * i <= gcdB; i++)
            if (gcdB % (lcmA * i) == 0) {
                System.out.println("s" + lcmA * i);
                total++;
            }

/*        for (int i = 1; i * lcmA < b.get(0); i++) {
            boolean flag = true;
            for (Integer integer : b) {
                if (integer % lcmA * i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) total++;
        }*/

        return total;
    }

    private static int gcd(List<Integer> b) {
        int res = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            res = gcd(res, b.get(i));       //loop mei fun->loop
        }
        return res;
    }

    private static int lcm(List<Integer> a) {
        int res = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            res = lcm(res, a.get(i));       //loop mei fun(lcm)->fun(gcd)->loop
        }
        return res;
    }

    private static int lcm(int n1, int n2) {
        return (n1 * n2) / gcd(n1, n2);
    }

    private static int gcd(int n1, int n2) {
        int hcf = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        return hcf;
    }
}
