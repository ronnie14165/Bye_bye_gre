package leetcode;

public class Solution_461_hammingDistance {
    public static int hammingDistance(int x, int y) {
        boolean[] xarray = new boolean[50];
        boolean[] yarray = new boolean[50];
        for (int i = 32; i >= 0; i--) {
            if (x >= Math.pow(2, i)) {
                x -= Math.pow(2, i);
                xarray[i] = true;
            } else {
                xarray[i] = false;
            }

            if (y >= Math.pow(2, i)) {
                y -= Math.pow(2, i);
                yarray[i] = true;
            } else {
                yarray[i] = false;
            }
        }
        int hamming = 0;
        for (int i = 0; i < 50; i++) {

            if (xarray[i] != yarray[i]) {
                hamming++;
            }
        }
        return hamming;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        System.out.println(hammingDistance(a, b));
    }
}
