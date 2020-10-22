package leetcode;

import java.util.HashSet;

public class Solution_217_containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> myhashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (myhashset.contains(nums[i])) {
                return true;
            } else {
                myhashset.add(nums[i]);
            }
        }
        return false;
    }
}
