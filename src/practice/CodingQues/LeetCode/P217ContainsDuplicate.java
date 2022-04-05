package practice.CodingQues.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class P217ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));

    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int i : nums)
            if (!mySet.contains(i)) mySet.add(i);
            else return true;
        return false;
    }
}
