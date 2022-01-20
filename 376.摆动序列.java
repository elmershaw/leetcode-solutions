<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
<<<<<<< HEAD
=======
        if (nums.length <= 1) {
            return nums.length;
        }
        int ans = 1;
        int curDiff = 0;
        int preDiff = 0;
        // int[][] dp = new int[nums.length][2];
        // int[] diff = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            curDiff = nums[i] - nums[i + 1];
            if (curDiff * preDiff <= 0 && curDiff != 0) {
                ans++;
                preDiff = curDiff;
            }
        }
        return ans;
>>>>>>> cb5f86a (add solutions from home PC)

    }
}
// @lc code=end

