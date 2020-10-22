package leetcode;

public class Solution_766_isToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length && j < matrix[0].length - i; j++) {
                if (matrix[j][i + j] != matrix[0][i]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length && j < matrix.length - i; j++) {
                if (matrix[i + j][j] != matrix[i][0]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 1, 2}};
        int[][] b = {{1, 2, 3}, {3, 1, 3}};
        System.out.println(isToeplitzMatrix(a));
        System.out.println(isToeplitzMatrix(b));
    }
}
