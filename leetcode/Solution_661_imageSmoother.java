package leetcode;

public class Solution_661_imageSmoother {
    public static int[][] imageSmoother(int[][] M) {
        int res[][] = new int[M.length][M[0].length];
        int a = M.length, b = M[0].length;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                int don = 0;
                int mol = 0;
                if (qua(i - 1, j - 1, a, b)) {
                    don += 1;
                    mol += M[i - 1][j - 1];
                }
                if (qua(i - 1, j, a, b)) {
                    don += 1;
                    mol += M[i - 1][j];
                }
                if (qua(i - 1, j+1, a, b)) {
                    don += 1;
                    mol += M[i - 1][j + 1];
                }

                if (qua(i, j - 1, a, b)) {
                    don += 1;
                    mol += M[i][j - 1];
                }
                if (qua(i, j, a, b)) {
                    don += 1;
                    mol += M[i][j];
                }
                if (qua(i, j+1, a, b)) {
                    don += 1;
                    mol += M[i][j + 1];
                }
                if (qua(i + 1, j - 1, a, b)) {
                    don += 1;
                    mol += M[i + 1][j - 1];
                }
                if (qua(i + 1, j, a, b)) {
                    don += 1;
                    mol += M[i + 1][j];
                }
                if (qua(i + 1, j + 1, a, b)) {
                    don += 1;
                    mol += M[i + 1][j + 1];
                }
                res[i][j] = mol / don;
                }
        }
        return res;
    }

    public static boolean qua(int x, int y, int xaxis, int yaxis) {
        if (0 <= x && x < xaxis && 0 <= y && y < yaxis) {
            return true;
        }
        return false;
    }
}
