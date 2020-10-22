package leetcode;

import java.util.HashMap;

public class Solution_169_majorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        int result = 0;
        for (int i : nums) {
            if (hash_table.get(i) > max) {
                max = hash_table.get(i);
                result = i;
            }
        }
        return result;
    }
}
