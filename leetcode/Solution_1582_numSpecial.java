package leetcode;

public class Solution_1582_numSpecial {
    public static int numSpecial(int[][] mat) {
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    boolean qua = true;
                    for (int k = 0; k < mat.length; k++) {
                        if (mat[k][j] != 0 && k != i) {
                            mat[k][j] = 2;
                            qua = false;
                        }
                    }
                    for (int k = 0; k < mat[i].length; k++) {
                        if (mat[i][k] != 0 && k != j) {
                            mat[i][k] = 2;
                            qua = false;
                        }
                    }
                    if (qua) {
                        res++;
                        System.out.println(i);
                        System.out.println(j);
                    } else {
                        mat[i][j] = 2;
                    }
                }
            }
        }
        return res;
    }
}
