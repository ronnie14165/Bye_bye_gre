package leetcode;

import java.util.Arrays;

public class Solution_1502_canMakeArithmeticProgression {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        int len = arr.length;
        if (len == 2) {
            return true;
        }
        Arrays.sort(arr);
        int diff = Math.abs(arr[0] - arr[1]);
        for (int i = 2; i < len; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) != diff) {
                return false;
            }
        }
        return true;
    }
}
