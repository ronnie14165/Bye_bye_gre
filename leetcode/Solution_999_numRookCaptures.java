package leetcode;

public class Solution_999_numRookCaptures {
    public static int numRookCaptures(char[][] board) {
        int res = 0;
        int len = 8;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 'R') {
                    int r = j + 1;
                    while (r < len) {
                        if (board[i][r] == 'B') {
                            break;
                        } else if (board[i][r] == 'p') {
                            res += 1;
                            break;
                        } else if (board[i][r] == '.') {
                            r++;
                        }
                    }
                    int l = j - 1;
                    while (l >= 0) {
                        if (board[i][l] == 'B') {
                            break;
                        } else if (board[i][l] == 'p') {
                            res += 1;
                            break;
                        } else if (board[i][l] == '.') {
                            l--;
                        }
                    }
                    int d = i + 1;
                    while (d < len) {
                        if (board[d][j] == 'B') {
                            break;
                        } else if (board[d][j] == 'p') {
                            res += 1;
                            break;
                        } else if (board[d][j] == '.') {
                            d++;
                        }
                    }
                    int u = i - 1;
                    while (u >= 0) {
                        if (board[u][j] == 'B') {
                            break;
                        } else if (board[u][j] == 'p') {
                            res += 1;
                            break;
                        } else if (board[u][j] == '.') {
                            u--;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char b[][] = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        char a[][] = {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        System.out.println(numRookCaptures(b));
    }
}
