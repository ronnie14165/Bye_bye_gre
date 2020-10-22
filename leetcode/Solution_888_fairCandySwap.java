package leetcode;

import java.util.Arrays;

public class Solution_888_fairCandySwap {
    public static int[] fairCandySwap(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int res[] = new int[2];
        int alen = A.length - 1;
        int blen = B.length - 1;
        int asum = 0, bsum = 0;
        for (int i = 0; i <= alen; i++) {
            asum += A[i];
        }
        for (int i = 0; i <= blen; i++) {
            bsum += B[i];
        }
        int diff = bsum - asum;
//        System.out.println(asum);
//        System.out.println(bsum);
//        System.out.println(diff);
        for (int i = 0; i <= alen; i++) {
            int target = A[i] + diff / 2;
            int left = 0;
            int right = blen;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (B[mid] == target) {
                    res[0] = A[i];
                    res[1] = B[mid];
                    return res;
                }
                if (left == right) {
                    break;
                }
                if (B[mid] > target) {
                    right = mid - 1;
                }
                if (B[mid] < target) {
                    left = mid + 1;
                }

            }
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }

    public static void main(String[] args) {
        int a[] = {35,17,4,24,10};
        int b[] = {63, 21};
        System.out.println(fairCandySwap(a,b)[0]);
        System.out.println(fairCandySwap(a,b)[1]);
    }
}
