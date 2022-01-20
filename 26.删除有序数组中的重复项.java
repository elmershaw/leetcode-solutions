/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int slowPointer = 0;
        for (int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if (nums[slowPointer] != nums[fastPointer]) {
                nums[++slowPointer] = nums[fastPointer];
                //slowPointer++;
            }
        }
        return slowPointer + 1;
    }
}
// @lc code=end

