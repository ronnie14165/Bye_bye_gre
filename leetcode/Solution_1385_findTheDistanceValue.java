package leetcode;

import java.util.Arrays;

public class Solution_1385_findTheDistanceValue {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            boolean add = true;
            int a = arr1[i] - d;
            int b = arr1[i] + d;
            int left = 0;
            int right = arr2.length - 1;
            while (left < right || left == right) {
                int mid = left + (right - left) / 2;
                if (a <= arr2[mid] && arr2[mid] <= b) {
                    add = false;

                    break;
                }
                if (a > arr2[mid]) {
                    left = mid + 1;
                } else if (arr2[mid] > b) {
                    right = mid - 1;
                }
            }
            if (add) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {4, -3, -7, 0, -10};
        int b[] = {10};
        System.out.println(findTheDistanceValue(a, b, 69));
    }
}
