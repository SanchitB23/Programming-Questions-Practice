package practice.CodingQues.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class P27RemoveElement {
    public static void main(String[] args) {
//        int[] x = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] x = new int[]{3, 2, 2, 3};
        int[] x = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
//        int[] x = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("removeElement(x,2) = " + removeElement(x, new Scanner(System.in).nextInt()) + Arrays.toString(x));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length < 1) return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
