package leetcode;

public class Solution_1572_diagonalSum {
    public static int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += mat[i][i];
        }
        for (int i = 0; i < len; i++) {
            sum += mat[i][len - 1 - i];
        }
        if (len % 2 == 1) {
            sum -= mat[len / 2][len / 2];
        }
        return sum;
    }
}
