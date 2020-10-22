package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_448_findDisappearedNumbersArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        List<Integer> mylist = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == 0) {
                mylist.add(i);
            }
        }
        return mylist;
    }

    public static void main(String[] args) {
        int a[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(a));
    }
}
