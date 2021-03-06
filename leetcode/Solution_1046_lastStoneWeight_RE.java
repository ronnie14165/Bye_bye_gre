package leetcode;

import java.util.Arrays;

public class Solution_1046_lastStoneWeight_RE {
    public static int max(int[] stones) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] > max) {
                max = stones[i];
                index = i;
            }
        }
        stones[index] = 0;
        return max;
    }
    public static int submax(int[] stones) {
        int submax = 0;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] > submax) {
                submax = stones[i];
            }
        }
        return submax;
    }


    public static int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        while (stones[stones.length - 2] != 0) {
            stones[stones.length - 1] -= stones[stones.length - 2];
            Arrays.sort(stones);

        }
        return stones[stones.length - 1];
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1, 100};
        System.out.println(lastStoneWeight(a));
    }
}
