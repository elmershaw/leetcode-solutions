import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m];
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(nums2[0]);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for (int j = 0; j < m; j++) {
            ans[j] = map.getOrDefault(nums1[j], -1);
        }
        return ans;
    }
}
// @lc code=end

