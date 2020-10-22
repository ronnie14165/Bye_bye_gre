package leetcode;

public class Solution_867_transpose {
    public int[][] transpose(int[][] A) {
        int res[][] = new int[A[0].length][A.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = A[j][i];
            }
        }
        return res;
    }
}
