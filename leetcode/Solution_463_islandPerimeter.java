package leetcode;

public class Solution_463_islandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int res = 0;
        int a = grid.length;
        int b = grid[0].length;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (grid[i][j] == 1) {
                    if (j - 1 < 0) {
                        res++;
                    } else if (grid[i][j - 1] == 0) {
                        res ++;
                    }
                    if (j + 1 == b) {
                        res++;
                    } else if (grid[i][j + 1] == 0) {
                        res ++;
                    }
                    if (i - 1 < 0) {
                        res++;
                    } else if (grid[i - 1][j] == 0) {
                        res ++;
                    }
                    if (i + 1 == a) {
                        res++;
                    } else if (grid[i + 1][j] == 0) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
