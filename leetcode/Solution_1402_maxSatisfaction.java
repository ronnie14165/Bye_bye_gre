package leetcode;

import java.util.Arrays;

public class Solution_1402_maxSatisfaction {
    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int max = 0;
        for (int i = 0; i < satisfaction.length; i++) {
            int tempMax = 0;
            for (int j = i; j < satisfaction.length; j++) {
                tempMax += satisfaction[j] * (j - i + 1);
            }
            if (tempMax > max) {
                max = tempMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-1, -8, 0, 5, -9};
        System.out.println(maxSatisfaction(a));
    }
}
