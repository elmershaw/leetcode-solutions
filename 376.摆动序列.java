import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        // dp[i] = dp[j] + 1
        int n = nums.length;
        if (n == 1) return 1;
        int[] diff = new int[n - 1];
        boolean zero = false;
        for (int i = 0; i < n - 1; i++) {
            diff[i] = nums[i] - nums[i + 1];
            if (diff[i] != 0) zero = true;
        }
        if (!zero) return 1;
        int ans = 1;
        for (int i = 0; i < n - 2; i++) {
            if (diff[i] > 0 && diff[i + 1] < 0 || diff[i] < 0 && diff[i + 1] > 0) {
                ans++;
            }
        }
        return ans + 1;
    }
}
// @lc code=end

