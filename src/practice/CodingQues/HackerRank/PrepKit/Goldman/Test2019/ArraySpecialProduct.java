package practice.CodingQues.HackerRank.PrepKit.Goldman.Test2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySpecialProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        System.out.println(findSpecialProduct(list));
    }

    private static List<Integer> findSpecialProduct(List<Integer> inputArray) {
        int prod = 1;
        for (int element :
                inputArray) {
            prod *= element;
        }
        List<Integer> result = new ArrayList<>();
        for (int element :
                inputArray) {
            result.add(prod / element);
        }
        return result;
    }
}
