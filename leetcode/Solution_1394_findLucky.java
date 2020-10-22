package leetcode;

import java.util.HashMap;

public class Solution_1394_findLucky {
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> mymap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mymap.containsKey(arr[i])) {
                mymap.replace(arr[i], mymap.get(arr[i]) + 1);
            } else {
                mymap.put(arr[i], 1);
            }
        }
        int res = -1;
        for (Integer key : mymap.keySet()) {
            if (key == mymap.get(key) && key > res) {
                res = key;
            }
        }
        return res;

    }
}
