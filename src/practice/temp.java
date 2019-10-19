package practice;

import java.util.Arrays;
import java.util.Scanner;

//FIXME Optimize
public class temp {
    int x;

    public static void main(String[] args) {
//        hackerEarthQue();
//        codechefA();
//        codechefB();
        baseConversion();
    }

    private static void baseConversion() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), cBase = scanner.nextInt(), resBase = scanner.nextInt();
        System.out.println(Integer.toString(Integer.parseInt(Integer.toString(num), cBase), resBase));
    }

    private static void codechefB() {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        do {

            int num = scanner.nextInt();
            System.out.println((codechefBFun1(num) % 1000000007));

            testCases--;
        } while (testCases != 0);
    }

    private static long codechefBFun1(int num) {
        long res = 1;
        for (int i = 0; i < num; i++) {
            res *= Math.pow(i + 1, num - i);
        }
        return res;
    }

    private static void codechefA() {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        do {

            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] b = new int[size];
            for (int i = 0; i < size; i++) {
                int count = 0;
                for (int j = i; j < size; j++) {
                    if (arr[i] < arr[j])
                        count++;
                }
                b[i] = count;
            }
            for (int x :
                    b) {
                System.out.print(x + " ");
            }
            System.out.println();
            testCases--;
        } while (testCases != 0);
    }


    private static void hackerEarthQue() {
        Scanner in = new Scanner(System.in);
//        String x = JOptionPane.showInputDialog("Type a Integer");
        int n = in.nextInt(), k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        int[] temp;
        for (int i = 0; i < n; i++) {
            temp = Arrays.copyOfRange(arr, i, arr.length);
            System.out.println(Arrays.toString(temp));
            int counter = 0;
            for (int value : temp) {
                if (value > k)
                    counter++;
            }
            if (counter == arr[i])
                sum += arr[i];
        }
        System.out.println(sum);
    }
}
