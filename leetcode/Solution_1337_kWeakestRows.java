package leetcode;

public class Solution_1337_kWeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int m = mat.length;
        int n = mat[0].length;
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 0 && mat[i][j - 1] == 1) {
                    num[i] = j;
                    break;
                } else if (mat[i][j] == 0 && mat[i][j - 1] == 0) {
                    num[i] = 0;
                    break;
                } else {
                    num[i] = n;
                }
            }
        }
        int index = 0;
        while (true) {

            int min = 1000;
            for (int i = 0; i < num.length; i++) {

                if (num[i] < min) {
                    min = num[i];
                }
            }
            for (int i = 0; i < num.length; i++) {
                if (num[i] == min) {
                    result[index] = i;
                    num[i] = 1001;
                    index++;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        int[][]a = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(kWeakestRows(a,3)[0]+"   "+kWeakestRows(a,3)[1]);
    }
}
