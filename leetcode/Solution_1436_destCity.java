package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution_1436_destCity {
    public String destCity(List<List<String>> paths) {
        HashSet<String> myhash = new HashSet<>();
        for (int i = 0; i < paths.size() ; i++) {
            String temp1 = paths.get(i).get(0);
            myhash.add(temp1);
        }
        for (int i = 0; i < paths.size(); i++) {
            if (!myhash.contains(paths.get(i).get(1))) {
                return paths.get(i).get(1);
            }
        }
        return "error";
    }
}
