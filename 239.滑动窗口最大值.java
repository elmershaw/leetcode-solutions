import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (x, y) -> y.compareTo(x));
        int[] ans = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (pq.size() < k) {
                pq.add(nums[i++]);
            }
            ans[index++] = pq.peek();
            pq.remove(nums[i - k]);
            i--;
        }
        return ans;
    }
}
// @lc code=end

