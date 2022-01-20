import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        //dp[i] the subarray must contains nums[i]
        //dp[i] = nums[i] > nums[j] ? max(dp[i], dp[j] + 1) : dp[i]
        
        //dp initiates with 1
        int res = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                //System.out.println(dp[i]);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
// @lc code=end

