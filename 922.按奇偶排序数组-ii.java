/*
 * @lc app=leetcode.cn id=922 lang=java
 *
 * [922] 按奇偶排序数组 II
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < nums.length && r >= 0) {
            if (nums[l] % 2 != 0 && nums[r] % 2 != 1) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }
            if (nums[l] % 2 == 0) {
                l += 2;
            }
            if (nums[r] % 2 == 1) {
                r -= 2;
            }
        }
        return nums;
    }
}
// @lc code=end

