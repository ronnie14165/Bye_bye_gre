package leetcode;

public class Solution_944_minDeletionSize {
    public static int minDeletionSize(String[] A) {
        int result = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length-1 ; j++) {
                if (A[j+1].charAt(i) < A[j].charAt(i)) {
                    result++;
                    break;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] b = {"cba", "daf", "ghi"};
        String[] d = {"zyx", "wvu", "tsr"};
        String[] c = {"a", "b", "c"};
//        System.out.println(minDeletionSize(b));
//        System.out.println(minDeletionSize(c));
        System.out.println(minDeletionSize(d));
    }
}
