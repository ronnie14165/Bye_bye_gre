package leetcode;

public class Solution_1295_findNumbers {
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if ((10 <= temp && temp <= 99) || (1000 <= temp && temp <= 9999) || temp == 100000) {
                result++;
            }
        }
        return result;
    }
}
