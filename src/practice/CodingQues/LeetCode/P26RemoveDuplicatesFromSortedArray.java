package practice.CodingQues.LeetCode;

import java.util.Arrays;

public class P26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] x = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("removeDuplicates(x) = " + removeDuplicates(x));
        System.out.println("Arrays.toString(x) = " + Arrays.toString(x));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) return 0;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
