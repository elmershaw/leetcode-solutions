/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        
        while (l < r) {
            int m = ((r - l) >> 1) + l;
            // System.out.println(m);
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return -1;
    }
}
// @lc code=end

