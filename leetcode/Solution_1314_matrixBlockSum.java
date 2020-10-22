package leetcode;

public class Solution_1314_matrixBlockSum {
    public static int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] array = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int temp = 0;
                for (int k = i - K < 0 ? 0 : i - K; k <= i + K && 0 <= k && k < mat.length; k++) {
                    for (int l = j - K < 0 ? 0 : j - K; l <= j + K && 0 <= l && l < mat[0].length; l++) {
                        temp += mat[k][l];
                        System.out.println(i + "  " + j + "   " + k + "    " + l + "   " + temp);
                    }
                }
                array[i][j] = temp;
            }
        }
        return array;
    }
}
