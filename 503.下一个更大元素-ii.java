import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=503 lang=java
 *
 * [503] 下一个更大元素 II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int[] rotateNums = new int[nums.length * 2];
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        //Arrays.copyOfRange();
        // for (int i = 0; i < nums.length; i++) {
        //     rotateNums[i] = nums[i];
        //     rotateNums[i + nums.length] = nums[i];
        // }
        Deque<Integer> stack = new ArrayDeque<>();
        for (int j = 0; j < nums.length * 2; j++) {
            while (!stack.isEmpty() && nums[j % nums.length] > nums[stack.peek()]) {
                int index = stack.pop();
                ans[index] = nums[j % nums.length];
            }
            if (j < nums.length) {
                stack.push(j);
            }
        }
        return ans;
    }
}
// @lc code=end

