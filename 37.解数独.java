import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) {
        backtracking(board, 0, 0);
    }

    private boolean backtracking(char[][] board, int row, int col) {
        // System.out.println(row + ", " + col);
        if (row == 9) {
            return true;
        }
        if (board[row][col] == '.') {
            for (int i = 1; i <= 9; i++) {
                if (isValid(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (col < 8) {
                        if (backtracking(board, row, col + 1)) return true;
                    } else {
                        if (backtracking(board, row + 1, 0)) return true;
                    }
                    board[row][col] = '.';
                }
            }
            return false;
        } else {
            if (col < 8) {
                return backtracking(board, row, col + 1);
            } else {
                return backtracking(board, row + 1, 0);
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col, int x) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == x + '0') return false;
            if (board[row][i] == x + '0') return false;
        }
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == x + '0') return false;
            }
        }
        return true;
    }
}
// @lc code=end

