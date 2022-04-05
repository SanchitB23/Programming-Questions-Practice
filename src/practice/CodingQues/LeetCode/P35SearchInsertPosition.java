package practice.CodingQues.LeetCode;

import java.util.Scanner;

public class P35SearchInsertPosition {
    public static void main(String[] args) {
        int[] x = new int[]{1, 3, 5, 6};
        System.out.println("searchInsert(arr,val) = " + searchInsert(x, new Scanner(System.in).nextInt()));
    }

    private static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) if (nums[i] >= target) return i;
        return nums.length;
    }
}
