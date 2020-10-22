package leetcode;

public class Solution_944_minDeletionSize_temp {
    public static int minDeletionSize(String[] A) {
        if(A == null || A.length == 0) return 0;
        //所有小写字母串的长度都相同
        int count = 0;
        for(int i = 0;i < A[0].length();i++){
            for(int j = 0;j < A.length - 1;j++){
                if(A[j].charAt(i) > A[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }

        return  count;

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
