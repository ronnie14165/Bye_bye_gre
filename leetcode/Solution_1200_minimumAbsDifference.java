package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution_1200_minimumAbsDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> mylist = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            mylist.add(arr[i]);
        }
        mylist.sort(Comparator.naturalOrder());
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < mylist.size() - 1; i++) {
            if (mylist.get(i + 1) - mylist.get(i) < diff) {
                res.removeAll(res);
                res.add(new ArrayList<>(Arrays.asList(mylist.get(i), mylist.get(i + 1))));
                diff = mylist.get(i + 1) - mylist.get(i);
            }
            else if (mylist.get(i + 1) - mylist.get(i) == diff) {
                res.add(new ArrayList<>(Arrays.asList(mylist.get(i), mylist.get(i + 1))));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {4, 2, 1, 3};
        System.out.println(minimumAbsDifference(a));
    }
}
