package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_1389_createTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            mylist.add(index[i], nums[i]);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = mylist.get(i);
        }
        return result;
    }
}