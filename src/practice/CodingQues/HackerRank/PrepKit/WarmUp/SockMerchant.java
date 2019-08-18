package practice.CodingQues.HackerRank.PrepKit.WarmUp;
/*
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are
socks with colors . There is one pair of color and one of color . There are three odd socks left, one of each color. The number of pairs is .
Sample Input

9
10 20 20 10 10 30 50 10 20

Sample Output

3

*/

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < num; i++) {

            for (int j = i + 1; j < num; j++) {
                if (arr[i] == arr[j] && arr[j] != 0) {
                    count++;
                    arr[j] = 0;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
