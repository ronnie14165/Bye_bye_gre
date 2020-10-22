package leetcode;

public class Solution_1266_minTimeToVisitAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 1; i < points.length; i++) {
            int a = Math.abs(points[i][0]-points[i-1][0]);
            int b = Math.abs(points[i][1]-points[i-1][1]);
            int temp = a > b ? a : b;
            result += temp;
        }
        return result;
    }
}
