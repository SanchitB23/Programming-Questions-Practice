package practice.CodingQues.HackerRank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i + 1 != arr.length) {
                count++;
//                if (arr[i] + 1 == 1)
//                    i++;
                if (i + 2 != arr.length && arr[i + 2] == 0)
                    i++;
            }
        }
        System.out.println(count);
    }
}
