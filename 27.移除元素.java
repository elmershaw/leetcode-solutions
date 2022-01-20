/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
<<<<<<< HEAD
        int slowPointer = 0;
        
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != val) {
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
        }
        return slowPointer;
=======
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[slow] = nums[i];
            slow++;
        }
        return slow;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

