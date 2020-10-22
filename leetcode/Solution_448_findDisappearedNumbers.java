package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_448_findDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            mylist.add(i + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (mylist.contains(nums[i])) {
                mylist.remove(nums[i]);
            }
        }
        return mylist;
    }

    public static void main(String[] args) {
        int a[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(a));
    }
}
