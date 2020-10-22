package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_728_selfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> resultlist = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            List<Integer> list = new ArrayList<Integer>();
            while (temp != 0) {
                list.add(temp % 10);
                temp /= 10;
            }
            boolean act = true;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == 0 || i % list.get(j) != 0) {
                    act = false;
                }
            }
            if (act) {
                resultlist.add(i);
            }
        }
        return resultlist;
    }
}
