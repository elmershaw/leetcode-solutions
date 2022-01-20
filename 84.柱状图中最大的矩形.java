import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] newHeights = new int[heights.length + 2];
        System.arraycopy(heights, 0, newHeights, 1, heights.length);
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int ans = 0;
        for (int i = 1; i < newHeights.length; i++) {
            
            while (newHeights[i] < newHeights[stack.peek()]) {
                int index = stack.pop();
                int prev = stack.peek();
                ans = Math.max(ans, (i - prev -1) * newHeights[index]);
            }
            stack.push(i);
            // System.out.println(stack);
            // System.out.println(ans);
        }
        return ans;
    }
}
// @lc code=end

