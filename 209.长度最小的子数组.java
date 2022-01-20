/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
<<<<<<< HEAD
        if (nums == null || nums.length == 0) return 0;
        int l = 0, r = 0;
        int windowSum = nums[0];
        int ans = nums.length + 1;
        while (true) {
            if (windowSum >= target) {
                ans = Math.min(r - l + 1, ans);
                windowSum -= nums[l];
                l++;
                if (l >= nums.length) break;
            } else {
                r++;
                if (r >= nums.length) break;
                windowSum += nums[r]; 
            }
        }
        if (ans > nums.length) return 0;
        return ans;
=======
        int l = 0;
        int r = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while ((r < nums.length || sum >= target) && l < nums.length) {
            if (sum >= target) {
                ans = Math.min(ans, r - l);
                sum -= nums[l];
                l++;
            } else {
                sum += nums[r];
                r++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

