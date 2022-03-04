/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int e = 1;
        int offset = 0;
        while (offset < n) {
            
            int x = n - offset;
            for (int j = offset; j < x - 1; j++) {
                res[offset][j] = e++;
                // e++;
            }
            for (int j = offset; j < x - 1; j++) {
                res[j][x - 1] = e++;
                // e++;
            }
            for (int j = x - 1; j > offset; j--) {
                res[x - 1][j] = e++;
                // e++;
            }
            for (int j = x - 1; j > offset; j--) {
                res[j][offset] = e++;
                // e++;
            }
            offset += 1;
     
        }
        if (n % 2 == 1) {
            res[n >> 1][n >> 1] = e;
        }
        return res;
    }
}
// @lc code=end

