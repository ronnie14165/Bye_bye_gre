package leetcode;

import java.util.Arrays;

public class Solution_1501_heightChecker {
    public static int heightChecker(int[] heights) {
        int len = heights.length;
        int dup[] = heights.clone();
//        int dup[] = new int[len];
//        for (int i = 0; i < len; i++) {
//            dup[i] = heights[i];
//        }
        Arrays.sort(dup);
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (dup[i] != heights[i]) {
                res += 1;
            }
        }
        return res;
    }
}
