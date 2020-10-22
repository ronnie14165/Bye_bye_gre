package leetcode;

public class Solution_1351_countNegatives_BinarySearch {
    public static int countNegatives(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            int l = 0;
            int r = grid[0].length - 1;

            while (l < r) {
                int m = (r - l) / 2 + l;
                if (grid[i][m] >= 0) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
            if (grid[i][grid[0].length - 1] < 0) {
                result += grid[0].length - 1 - l + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{4, 3, 2, -1}, {4, 3, 2, -1}, {4, 3, 2, -1}, {4, 3, 2, -1}};
        int[][] b = {{3, 2}, {2, 0}};
        System.out.println(countNegatives(a));
        System.out.println(countNegatives(b));
    }
}
