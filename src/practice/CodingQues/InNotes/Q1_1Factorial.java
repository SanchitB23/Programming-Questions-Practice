package practice.CodingQues.InNotes;
//Factorial of a number

import java.util.Scanner;

public class Q1_1Factorial {
    private static int[] store = new int[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("factWithLoop(int num) = " + factWithLoop(num));
        System.out.println("factWithRecursion(num) = " + factWithRecursion(num));
        System.out.println("factDynamic(num) = " + factDynamic(num));
    }

    private static int factDynamic(int num) {
        if (num > -1) {
            store[0] = 1;
            if (store[num] == 0) {
                store[num] = num * factWithRecursion(--num);
            }
        }
        return store[num];
    }


    /*
        private static int factWithRecursion(int num) {
            if (num != 0) {
                factRecursion *= num;
                factWithRecursion(--num);
            }
            return factRecursion;
        }
    */

    private static int factWithRecursion(int num) {
        if (num <= 1) {
            return num;
        }
        return num * factWithRecursion(--num);
    }

    private static int factWithLoop(int num) {
        int factorial = 1;
        while (num != 0) {
            factorial *= num--;
        }
        return factorial;
    }
}
