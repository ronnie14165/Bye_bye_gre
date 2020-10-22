package leetcode;

public class Solution_883_projectionArea {
    public static int projectionArea(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    result++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
            result += max;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max) {
                    max = grid[j][i];
                }
            }
            result += max;
        }
        return result;
    }

}
