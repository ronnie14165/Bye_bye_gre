package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution_575_distributeCandies_hash {

    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        int result = set.size();
        int half = candies.length / 2;
        return result < half ? result : half;

    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] a1 = {1, 2, 2, 1, 1, 1,};
        System.out.println(distributeCandies(a));
        System.out.println(distributeCandies(a1));


    }
}
