package leetcode;

public class Solution_221_maximalSquare_slow {
    public static boolean isFullCheck(char[][] matrix, int i, int j, int k) {
        for (int l = i; l < i + k; l++) {
            for (int m = j; m < j + k; m++) {
                if (matrix[l][m] == '0') {
                    return false;
                }
            }
        }
        return true;
    }
    public static int maximalSquare(char[][] matrix) {
        if (matrix == null) {
            return 0;
        }
        int result = 0;
        for (int size = 1; size <= Math.min(matrix.length, matrix[0].length); size++) {
            for (int i = 0; i < matrix.length - size + 1; i++) {
                for (int j = 0; j < matrix[0].length - size + 1; j++) {
                    if (isFullCheck(matrix, i, j, size)) {
                        result = size;
                    }
                    //System.out.println(i+"     "+j+"    "+isFullCheck(matrix, i, j, size)+"   "+size+"    "+result);
                }
            }
        }
        return result*result;
    }

}
