package leetcode;

import java.util.HashSet;

public class Solution_961_repeatedNTimes {
    public static int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            } else {
                set.add(A[i]);
            }
        }
        return 0;
    }
}
