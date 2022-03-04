/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) {
                        ans += 2;
                    }
                    if (j == 0 || grid[i][j - 1] == 0) {
                        ans += 2;
                    }
                }
                // System.out.println(ans);
            }
        }
        return ans;
    }
}
// @lc code=end

