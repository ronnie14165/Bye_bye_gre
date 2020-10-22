package leetcode;

public class Solution_338_countBits {
    public int[] countBits(int num) {
        int res[] = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int temp = 0;
            int index = i;
            while (index > 0) {
                if (index % 2 == 0) {
                    index /= 2;
                } else {
                    index -= 1;
                    temp++;
                }
            }
            res[i] = temp;
        }
        return res;
    }
}
