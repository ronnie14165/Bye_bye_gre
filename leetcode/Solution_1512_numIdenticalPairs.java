package leetcode;

import java.util.HashMap;

public class Solution_1512_numIdenticalPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int temp = map.get(nums[i]);
                map.replace(nums[i], temp + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int sum = 0;
        for (int key : map.keySet()) {
            int temp_value = map.get(key);
            if (temp_value >= 2) {
                sum += temp_value * (temp_value - 1) / 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1, 1, 3};
        int b[] = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(a));
        System.out.println(numIdenticalPairs(b));

    }

}
