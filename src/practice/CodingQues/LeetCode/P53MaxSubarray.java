package practice.CodingQues.LeetCode;

public class P53MaxSubarray {
    public static void main(String[] args) {
        System.out.println("maxSubArray(new int[]{}) = " + maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private static int maxSubArray(int[] nums) {
        int sum = nums[0], currSum = sum, i = 1;
        while (i < nums.length) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            sum = Math.max(sum, currSum);
            i++;
        }
        return sum;
    }
}
