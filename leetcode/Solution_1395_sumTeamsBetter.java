package leetcode;

public class Solution_1395_sumTeamsBetter {
    public int numTeams(int[] rating) {
        int res = 0;
        for(int i = 0; i < rating.length; i++)
        {
            for(int j = i + 1; j < rating.length; j++)
            {
                if (rating[i] < rating[j]) {
                    for (int k = j + 1; k < rating.length; k++) {
                        if (rating[j] < rating[k]) {
                            res++;
                        }
                    }
                }
                if (rating[i] > rating[j]) {
                    for (int k = j + 1; k < rating.length; k++) {
                        if (rating[j] > rating[k]) {
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }

}
