package leetcode;

import java.util.Arrays;

public class Solution_1046_lastStoneWeight {
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
