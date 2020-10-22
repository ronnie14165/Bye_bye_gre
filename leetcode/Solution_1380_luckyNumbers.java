package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_1380_luckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int max = matrix[0][i];
            int temp = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                    temp = j;
                }
            }
            boolean ifLucky = true;
            for (int j = 0; j < n && ifLucky; j++) {
                if (matrix[temp][j] < max) {
                    ifLucky = false;
                }
            }
            if (ifLucky) {
                list.add(max);
            }
        }
        return list;
    }
}
