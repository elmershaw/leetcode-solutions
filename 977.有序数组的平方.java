/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0;
        int r = n - 1;
        int i = n - 1;
        while (l <= r) {
            int lPow = (int)Math.pow(nums[l], 2);
            int rPow = (int)Math.pow(nums[r], 2);
            if (lPow > rPow) {
                ans[i--] = lPow;
                l++;
            } else {
                ans[i--] = rPow;
                r--;
            }
        }
        return ans;
    }
}
// @lc code=end

