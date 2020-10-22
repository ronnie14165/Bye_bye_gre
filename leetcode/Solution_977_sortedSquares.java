package leetcode;

import java.util.Arrays;

public class Solution_977_sortedSquares {
    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.abs(A[i]);
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        return A;
    }
}
