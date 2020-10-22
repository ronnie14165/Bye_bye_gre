package leetcode;

public class Solution_278_firstBadVersion {
    boolean isBadVersion(int version){
        //unknown
        return true;
    }
    public int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        if (isBadVersion(1)) {
            return 1;
        }
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid)&&isBadVersion(mid+1)) {
                return mid + 1;
            }
            else if (isBadVersion(mid)) {
                right = mid - 1;
            }
            else if (!isBadVersion(mid + 1)) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
