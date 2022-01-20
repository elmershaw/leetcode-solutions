import java.util.ArrayDeque;
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
        Deque<Integer> stack = new ArrayDeque<>();
        //int[] ans2 = new int[nums2.length];
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        //Arrays.fill(ans, -1);
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int index = stack.pop();
                map.put(nums2[index], nums2[i]);
            }
            stack.push(i);
        }
        for (int j = 0; j < nums1.length; j++) {
            ans[j] = map.getOrDefault(nums1[j], -1);
        }
        return ans;
    }
}
// @lc code=end

