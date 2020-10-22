package leetcode;

public class Solution_566_matrixReshape {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row * col < r * c) {
            return nums;
        }
        int[][] matrix = new int[r][c];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                int array_index = (i - 1) * c + j - 1;
                matrix[i - 1][j - 1] = nums[array_index / col][array_index % col];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2}, {3, 4}};
        System.out.println();
    }
}
