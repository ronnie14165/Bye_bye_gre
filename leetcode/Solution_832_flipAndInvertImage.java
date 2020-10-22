package leetcode;

public class Solution_832_flipAndInvertImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][A[0].length - 1 - j] == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = 0;
                }

            }
        }
        return result;
    }
}
