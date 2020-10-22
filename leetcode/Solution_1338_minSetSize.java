package leetcode;

import java.util.Arrays;

public class Solution_1338_minSetSize {
    public static int minSetSize(int[] arr) {
        int[] bucket = new int[100010];
        int result = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }
        Arrays.sort(bucket);
        for (int i = bucket.length - 1; i > 0; i--) {
            result += bucket[i];
            index++;
            if (result >= arr.length / 2) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(a));
    }
}
