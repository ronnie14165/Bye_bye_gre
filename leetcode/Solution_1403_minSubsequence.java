package leetcode;

import java.util.*;

public class Solution_1403_minSubsequence {
    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            value += nums[nums.length-i-1];
            list.add(nums[nums.length-i-1]);
            if (value > sum / 2) {
                return list;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] b = {4, 4, 7, 7, 6};

        for (int i = 0; i < minSubsequence(b).size(); i++) {
            System.out.println(minSubsequence(b).get(i));
        }
        System.out.println();
    }
}
