/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int[] ans = new int[nums.length];
        int l = 0;
        int r = 0;
        for (; r < nums.length; r++) {
            if (nums[r] >= 0) {
                break;
            }
        }
        l = r - 1;
        int index = 0;
        while (l >= 0 && r < nums.length) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                ans[index++] = nums[r] * nums[r];
                r++;
            } else {
                ans[index++] = nums[l] * nums[l];
                l--;
            }
        }
        while (l >= 0) {
            ans[index++] = nums[l] * nums[l];
            l--;
        }
        while (r < nums.length) {
            ans[index++] = nums[r] * nums[r];
            r++;
        }
        return ans;
    }
}
// @lc code=end

