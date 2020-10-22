package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_452_findMinArrowShots {


        public static int findMinArrowShots(int[][] points) {
            if (points.length == 0) {
                return 0;
            }
            Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
            int cnt = 1;
            int end = points[0][1];
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] <= end) {
                    continue;
                }
                end = points[i][1];
                cnt++;
            }
            return cnt;
        }

    public static void main(String[] args) {
        int[][] a = {{10,16},{2,8},{1,6},{7,12}};
        int[][] b = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(findMinArrowShots(a));
        System.out.println(findMinArrowShots(b));
    }
}
