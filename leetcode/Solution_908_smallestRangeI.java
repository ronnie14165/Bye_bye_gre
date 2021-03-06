package leetcode;

public class Solution_908_smallestRangeI {
    public static int smallestRangeI(int[] A, int K) {
        if (A.length == 1) {
            return 0;
        }
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        if (max - min > 2 * K) {
            return max - min - 2 * K;
        } else {
            return 0;
        }
    }
}
