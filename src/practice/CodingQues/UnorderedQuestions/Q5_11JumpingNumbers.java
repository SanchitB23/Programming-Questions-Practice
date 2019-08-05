package practice.CodingQues.UnorderedQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_11JumpingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        [[],[]]
        ArrayList<Integer> numbersJumping = new ArrayList<>();
        int testCases = scanner.nextInt();
        do {
            int number = scanner.nextInt();
            for (int i = 0; i <= number; i++) {
                if (jumpingNumbers(i)) {
                    numbersJumping.add(i);
                }
            }
            System.out.println(numbersJumping);
            numbersJumping.clear();
            testCases--;
        } while (testCases != 0);
    }

    private static boolean jumpingNumbers(int num) {
        int temp = num;
        if (num / 10 == 0) {
            return true;
        }
        boolean flag = true;
        while (temp > 0) {
            int x = temp % 10;
            temp /= 10;
            int y = temp % 10;
            temp /= 10;
            if (Math.abs(x - y) == 1) {
                flag = true;
                continue;
            }
            flag = false;
        }
        return flag;
    }
}
