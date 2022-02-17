import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lToR = new int[n];
        int[] rToL = new int[n];
        // Arrays.fill(lToR, -1);
        // Arrays.fill(rToL, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;
        rToL[0] = height[0];
        for (int i = 1; i < n; i++) {
            // while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
            //     lToR[stack.pop()] = i;
            // }
            // stack.push(i);
            rToL[i] = Math.max(rToL[i - 1], height[i]);
        }
        // stack.clear();
        lToR[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            // while (!stack.isEmpty() && height[j] > height[stack.peek()]) {
            //     rToL[stack.pop()] = j;
            // }
            // stack.push(j);
            lToR[j] = Math.max(lToR[j + 1], height[j]);
        }
        int ans = 0;
        for (int m = 1; m < n - 1; m++) {
            int tmp = Math.min(lToR[m], rToL[m]) - height[m];
            if (tmp > 0) ans += tmp;
        }
        return ans;
    }
}
// @lc code=end

