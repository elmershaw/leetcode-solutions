import java.util.Deque;

/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        //Deque<Integer> stack = new ArrayDeque<>();
        int n = height.length;
        int[] lToR = new int[n];
        int[] rToL = new int[n];

        for (int i = 1; i < n; i++) {
            lToR[i] = Math.max(height[i - 1], lToR[i - 1]);
        }
        // stack.clear();
        for (int j = n - 2; j >= 0; j--) {
            rToL[j] = Math.max(height[j + 1], rToL[j + 1]);
        }
        int res = 0;
        for (int k = 0; k < n; k++) {
            int tmp = Math.min(lToR[k], rToL[k]) - height[k]; 
            if (tmp > 0) {
                res += tmp;
            }
        }
        return res;
    }
}
// @lc code=end

