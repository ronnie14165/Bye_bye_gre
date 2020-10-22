package leetcode;

public class Solution_1351_countNegatives {
    public static int countNegatives(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length ; j++) {
                if (grid[i][j] < 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
