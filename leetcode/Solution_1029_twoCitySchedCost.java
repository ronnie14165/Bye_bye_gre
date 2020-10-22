package leetcode;

import java.util.Arrays;

public class Solution_1029_twoCitySchedCost {
    
    public static int twoCitySchedCost(int[][] costs) {
        int result = 0;
        int[] minus = new int[costs.length];
        for (int i = 0; i < costs.length ; i++) {
            result += costs[i][0];
            minus[i] = costs[i][1] - costs[i][0];

        }
        Arrays.sort(minus);
        for (int i = 0; i < costs.length/2; i++) {
            result += minus[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] b = {{90,20},{21,40}};
        System.out.println(twoCitySchedCost(b));
    }

}
