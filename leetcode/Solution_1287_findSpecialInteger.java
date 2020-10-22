package leetcode;

import java.util.HashMap;

public class Solution_1287_findSpecialInteger {
    public static int findSpecialInteger(int[] arr) {
        int len = arr.length;
        double fourth = len / 4.0;
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mymap.containsKey(arr[i])) {
                mymap.replace(arr[i], mymap.get(arr[i]) + 1);
            } else {
                mymap.put(arr[i], 1);
            }
            if (mymap.get(arr[i]) > fourth) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println(findSpecialInteger(a));
    }
}
