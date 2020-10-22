package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_1431_kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (temp < candies[j]) {
                    list.add(false);
                    break;
                }
            }
            if (list.size() != i+1) {
                list.add(true);
            }
        }
        return list;
    }
}
