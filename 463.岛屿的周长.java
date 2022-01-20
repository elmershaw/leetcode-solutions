/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    int addon = 4;
                    if (j > 0 && grid[i][j - 1] == 1) {
                        addon--;
                    }
                    if (i > 0 && grid[i - 1][j] == 1) {
                        addon--;
                    }
                    if (j < col - 1 && grid[i][j + 1] == 1) {
                        addon--;
                    }
                    if (i < row - 1 && grid[i + 1][j] == 1) {
                        addon--;
                    }
                    // System.out.println(addon);
                    ans += addon;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

