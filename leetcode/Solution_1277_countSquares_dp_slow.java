package leetcode;

public class Solution_1277_countSquares_dp_slow {
    public static int countSquares(int[][] matrix) {
        int result = 0;
        int[][][] dp = new int[matrix.length][matrix[0].length][Math.min(matrix.length, matrix[0].length) + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    result++;
                    dp[i][j][1] = 1;
                }
            }
        }
        for (int size = 2; size <= Math.min(matrix.length, matrix[0].length); size++) {
            for (int i = 0; i < matrix.length - size + 1; i++) {
                for (int j = 0; j < matrix[0].length - size + 1; j++) {
                    if (dp[i][j][size - 1] == 1) {
                        boolean act = true;
                        for (int k = i ; k <= i + size - 1; k++) {
                            if (matrix[k][j + size - 1] != 1) {
                                act = false;
                            }
                        }
                        for (int k = j ; k <= j + size - 1; k++) {
                            if (matrix[i + size - 1][k] != 1) {
                                act = false;
                            }
                        }
                        if (act) {
                            result++;
                            dp[i][j][size]++;
                        }
                    }
                }
            }
        }
        return result;
    }
}
