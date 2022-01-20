/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
<<<<<<< HEAD

    public boolean canJump(int[] nums) {
        // int i = 0;
        int n = nums.length;
        int longestStep =nums[0];
        for (int i = 0; i <= longestStep; i++) {
            longestStep = Math.max(longestStep, nums[i] + i);
            if (longestStep >= n - 1) return true;
=======
    public boolean canJump(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + i >= nums.length) {
                return true;
            }
            
>>>>>>> cb5f86a (add solutions from home PC)
        }
        return false;
    }
}
<<<<<<< HEAD
// @lc code=end
=======
// @lc code=end
>>>>>>> cb5f86a (add solutions from home PC)
