package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_1009_bitwiseComplement {
    public static int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        List<Integer> mylist = new ArrayList<>();
        while (N != 0) {
            if (N % 2 == 0) {
                mylist.add(1);
            } else {
                mylist.add(0);
            }
            N /= 2;
        }
        int result = 0;
        for (int i = mylist.size() - 1; i >= 0; i--) {
            result *= 2;
            result += mylist.get(i);
        }
        return result;

    }
}
