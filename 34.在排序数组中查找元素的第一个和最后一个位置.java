/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};
        if (n == 0) return ans;
        int l = 0;
        int r = n;
        while (l < r) {
            int m = ((r - l) >> 1) + l;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (l >= n || nums[l] != target) return ans;
        ans[0] = l;
        l = 0;
        r = n;
        while (l < r) {
            int m = ((r - l) >> 1) + l;
            if (nums[m] > target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        ans[1] = l - 1;
        return ans;
    }

    // private int goL(int[] nums, int target, int l, int r) {
    //     int m = ((r - l) >> 1) + l;
    //     while (nums[m] < target) {
            
    //     }
    // }
}
// @lc code=end

