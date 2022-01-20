<<<<<<< HEAD
import java.util.HashMap;

=======
>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
<<<<<<< HEAD
        int steps = 0;
        int longestStep = nums[0];
        for (int i = 0; i < longestStep; i++) {
            
        }
=======
        // int ans = 0;
        if (nums.length <= 1) return 0;
        int stepGap = 0;
        int nextStep = 0;
        int steps = 0;
        for (int i = 0; i <= stepGap; i++) {
            if (i + nums[i] > nextStep) nextStep = i + nums[i];
            if (nextStep >= nums.length - 1) break;
            if (i == stepGap) {
                steps++;
                stepGap = nextStep;
                nextStep = 0;
            }
        }
        return steps + 1;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

<<<<<<< HEAD
=======
135
>>>>>>> cb5f86a (add solutions from home PC)
