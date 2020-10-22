package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Solution_1_twoSum_hashMap {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[]{-1, -1};

        }
        int[] result = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;

            }
            map.put(nums[i], i);
        }


        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 8,9};
        int b = 10;
        System.out.println(twoSum(a, b)[0] + " " + twoSum(a, b)[1]);

    }
}
