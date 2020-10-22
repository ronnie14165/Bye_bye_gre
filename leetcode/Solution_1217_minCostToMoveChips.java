package leetcode;

public class Solution_1217_minCostToMoveChips {
    public static int minCostToMoveChips(int[] chips) {
        int single = 0;
        int dou = 0;
        for (int i = 0; i < chips.length; i++) {
            if (chips[i] % 2 == 0) {
                dou++;
            } else {
                single++;
            }
        }
        return (single>dou)?dou:single;


    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(minCostToMoveChips(a));
    }

//    Answer:
//    int count = 0;
//	for (int chip : chips) count+=chip%2;
//	return Math.min(count, (chips.length - count));
}
