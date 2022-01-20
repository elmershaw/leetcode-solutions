import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int s = m < n ? m : n;
        int loop = s / 2;
        List<Integer> ans = new ArrayList<>();
        while (loop > 0) {
            int i = startX;
            int j = startY;
            for (;j < startY + n - offset; j++) {
                ans.add(matrix[i][j]);
            } 
            for (;i < startX + m - offset; i++) {
                ans.add(matrix[i][j]);
            }
            for (;j > startY; j--) {
                ans.add(matrix[i][j]);
            }
            for (;i > startX; i--) {
                ans.add(matrix[i][j]);
            }
            startX++;
            startY++;
            loop--;
            offset += 2;
        }
        if (s % 2 == 1) {
            if (m < n) {
                for (int k = startY; k < n - m / 2; k++) {
                    ans.add(matrix[startX][k]);
                }
            } else {
                for (int k = startX; k < m - n / 2; k++) {
                    ans.add(matrix[k][startY]);
                }
            }
        }
        return ans;
    }
}
// @lc code=end

