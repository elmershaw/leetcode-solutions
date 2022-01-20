/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }
        int l = 0;
        int r = nums.length;
        // the first number which greater than or equals to target
        while (l < r) {
            int m = ((r - l) >> 2) + l;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (l <nums.length && nums[l] == target) {
            ans[0] = l;
        } else {
            return ans;
        }
        l = 0;
        r = nums.length;
        // the first number which greater than target
        while (l < r) {
            int m = ((r - l) >> 2) + l;
            if (nums[m] <= target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        ans[1] = l - 1;
        return ans;
    }
}
// @lc code=end

