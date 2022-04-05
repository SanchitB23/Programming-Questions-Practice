package practice.CodingQues.LeetCode;

public class P88MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1, len2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (len1 < 0) {
                nums1[i] = nums2[len2--];
                continue;
            }
            if (len2 < 0) {
                nums1[i] = nums1[len1--];
                continue;
            }
            if (nums1[len1] >= nums2[len2])
                nums1[i] = nums1[len1--];
            else
                nums1[i] = nums2[len2--];
        }
    }
}