package practice.CodingQues.LeetCode;

import java.util.Arrays;

public class P704BinarySearch {
    public static void main(String[] args) {
        System.out.println("search(new int[]{-1,0,3,5,9,12},9) = " + search(new int[]{-1, 0, 3, 5, 9, 12}, 8));
    }

    private static int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index < 0 ? -1 : index;
    }
}
