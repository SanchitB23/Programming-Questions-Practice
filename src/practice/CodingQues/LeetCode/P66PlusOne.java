package practice.CodingQues.LeetCode;

import java.util.Arrays;

public class P66PlusOne {
    public static void main(String[] args) {
        int[] x = {9};
        System.out.println("plusOne = " + Arrays.toString(plusOne(x)));
    }

    public static int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else digits[i] = 0;
        }
        res[0] = 1;
        System.arraycopy(digits, 0, res, 1, res.length - 1);
        return res;
    }
}
