package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_922_sortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                even.add(A[i]);
            } else {
                odd.add(A[i]);
            }
        }
        for (int i = 0; i < len / 2; i += 1) {
            A[2 * i] = even.get(i);
        }
        for (int i = 0; i < len / 2; i += 1) {
            A[2 * i + 1] = odd.get(i);
        }
        return A;

    }

    public static void main(String[] args) {
        int s[] = {2, 1, 3, 4};
        System.out.println(sortArrayByParityII(s)[0]);
        System.out.println(sortArrayByParityII(s)[1]);
        System.out.println(sortArrayByParityII(s)[2]);
        System.out.println(sortArrayByParityII(s)[3]);
    }
}
