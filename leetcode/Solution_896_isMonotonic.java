package leetcode;

import java.text.BreakIterator;

public class Solution_896_isMonotonic {
    public static boolean isMonotonic(int[] A) {
        int len = A.length;
        if (len == 1 || len == 2) {
            return true;
        }
        int a = A[0];
        int b = Integer.MAX_VALUE;
        int temp = 1;
        while (b == Integer.MAX_VALUE && temp < A.length) {
            if (A[temp] != a) {
                b = A[temp];
                break;
            } else {
                temp++;
            }
        }
        if (a < b) {
            for (int i = 1; i < len; i++) {
                if (A[i - 1] > A[i]) {
                    return false;
                }
            }
        }
        if (a > b) {
            for (int i = 1; i < len; i++) {
                if (A[i - 1] < A[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {2, 2, 2, 3,4};
        System.out.println(isMonotonic(a));
    }
}
