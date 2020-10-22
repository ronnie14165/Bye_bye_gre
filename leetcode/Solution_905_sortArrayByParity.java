package leetcode;

public class Solution_905_sortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int[] even = new int[A.length];
        int even_index = 0;
        int[] odd = new int[A.length];
        int odd_index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                even[even_index++] = A[i];
            } else {
                odd[odd_index++] = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (i < even_index) {
                A[i] = even[i];
            } else {
                A[i] = odd[i - even_index];
            }
        }
        return A;
    }
}
