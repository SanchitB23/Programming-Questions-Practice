package company.JobTests;
//https://www.geeksforgeeks.org/find-second-largest-element-array/

/*
 * Question - Given an Array (max 1000), return second-largest integer
 * Input - n -> Array Length ; arr -> Actual Array
 * Output - second-largest number in array or -1*/

import java.util.Scanner;

public class NagarroJuly2022_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(get2ndLargest(n, arr));
    }

    private static int get2ndLargest(int n, int[] arr) {
        if (n < 2) return -1;
        /*  Simple Method
      Arrays.sort(arr);
        for (int i = n-2; i >= 0; i--) {
            if (arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;*/
        int first, second;
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        if (second != Integer.MIN_VALUE) return second;
        else return -1;
    }
}
