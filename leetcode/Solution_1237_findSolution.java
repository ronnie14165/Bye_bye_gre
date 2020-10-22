package leetcode;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;
class CustomFunction{
    public int f(int x, int y) {
        return 0;
        //fake
    }
}
public class Solution_1237_findSolution {



    public static List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z; j++) {
                if (customfunction.f(i, j) == z) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    mylist.add(temp);
                    break;
                } else if (customfunction.f(i, j) > z) {
                    break;
                }


            }
        }
        return mylist;
    }
}
