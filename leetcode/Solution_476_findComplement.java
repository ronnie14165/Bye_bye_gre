package leetcode;

public class Solution_476_findComplement {
    public static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (num % 2 == 0) {
                sb.append(0);
                num /= 2;
            } else {
                sb.append(1);
                num /= 2;
            }
        }
        sb.reverse();
        //System.out.println(sb);
        int res = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                res *= 2;
                res += 1;
            } else {
                res *= 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(2));
        System.out.println(findComplement(1));
    }
}
