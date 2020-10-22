package leetcode;

public class Solution_852_peakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (A[m - 1] < A[m] && A[m] < A[m + 1]) {
                l = m + 1;
            } else if (A[m - 1] > A[m] && A[m] > A[m + 1]) {
                r = m - 1;
            } else {
                return m;
            }

        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {0,1,0};
        System.out.println(peakIndexInMountainArray(a));
        System.out.println(peakIndexInMountainArray(b));
    }

}
