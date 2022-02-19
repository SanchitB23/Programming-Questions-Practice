package practice.CodingQues.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (flag) break;
            for (int j = 0; j < nums.length; j++) {
                if (flag) break;
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    res = new int[]{i, j};
                    flag = true;
                }
            }
        }
        return res;
    }
}
