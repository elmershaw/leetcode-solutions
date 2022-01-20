/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        return Math.max(loot(nums, 0, n - 2), loot(nums, 1, n - 1));
    }

    private int loot(int[] nums, int l, int r) {
        
        if (r == l) return nums[l];
        int x = 0, y = 0, z = 0;
        for (int i = l; i <= r; i++) {
            x = y;
            y = z;
            z = Math.max(x + nums[i], y);
        }
        return z;
    }
}
// @lc code=end

