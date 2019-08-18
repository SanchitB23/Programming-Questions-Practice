package practice.CodingQues.HackerRank.PrepKit.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int lr = scanner.nextInt();
        int[] arr = new int[size], temp = new int[lr];

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        System.arraycopy(arr, 0, temp, 0, lr);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = lr; i < size; i++)
            res.add(arr[i]);
        for (int i = 0; i < lr; i++)
            res.add(temp[i]);
        int[] resi = new int[res.size()];
        int i = 0;
        for (int j :
                res) {
            resi[i] = j;
            i++;
        }
        System.out.println(Arrays.toString(resi));
    }
}
