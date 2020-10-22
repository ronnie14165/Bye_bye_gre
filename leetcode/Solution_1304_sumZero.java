package leetcode;

public class Solution_1304_sumZero {
    public static int[] sumZero(int n) {
        int[] array = new int[n];
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                array[i] = i + 1;
            }
            for (int i = n / 2; i < n; i++) {
                array[i] = -array[i - n / 2];
            }
        } else {
            for (int i = 0; i < n / 2-1; i++) {
                array[i] = i + 1;
            }
            for (int i = n / 2+1; i < n; i++) {
                array[i] = -array[i - n / 2-1];
            }
            array[n /2] = 0;
        }
        return array;
    }
}
