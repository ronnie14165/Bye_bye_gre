package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_435_eraseOverlapIntervals {


        public static int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length == 0) {
                return 0;
            }
            Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
            int cnt = 1;
            int end = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] <= end) {
                    continue;
                }
                end = intervals[i][1];
                cnt++;
            }
            return intervals.length - cnt;
        }

    public static void main(String[] args) {
        int[][] a = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(eraseOverlapIntervals(a));
    }
}
