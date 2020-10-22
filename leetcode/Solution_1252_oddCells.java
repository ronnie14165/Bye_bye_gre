package leetcode;

public class Solution_1252_oddCells {
    public static int oddCells(int n, int m, int[][] indices) {
        int[] n_array = new int[n];
        int[] m_array = new int[m];
        int[][] array = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
            n_array[indices[i][0]]++;
        }
        for (int i = 0; i < indices.length; i++) {
            m_array[indices[i][1]]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] += n_array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] += m_array[j];
            }
        }
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] % 2 == 1) {
                    num++;
                }
            }
        }
        return num;
    }
}
