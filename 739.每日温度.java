import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}
// @lc code=end
