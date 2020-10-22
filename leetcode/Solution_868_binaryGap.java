package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_868_binaryGap {
    public static int binaryGap(int N) {
        int[] array = new int[30];
        int index = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (N != 0) {
            if (N % 2 == 1) {
                list.add(1);
            } else {
                list.add(0);
            }
            N /= 2;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                array[index++] = i;
            }
        }
        int max = 0;
        for (int i = 1; i < index; i++) {
            int temp_max = array[i] - array[i - 1];
            if (temp_max > max) {
                max = temp_max;
            }
        }
        return max;
    }
}
