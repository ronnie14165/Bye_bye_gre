package leetcode;

public class Solution_1450_busyStudent {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        int num = startTime.length;
        for (int i = 0; i < num; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                result++;
            }
        }
        return result;
    }
}
