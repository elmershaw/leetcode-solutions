/*
 * @lc app=leetcode.cn id=135 lang=java
 *
 * [135] 分发糖果
 */

// @lc code=start
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int ans = n;
        int[] candy = new int[n];
        
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int j = n - 2; j >= 0; j--) {
            if (ratings[j] > ratings[j + 1]) {
                candy[j] = Math.max(candy[j], candy[j + 1] + 1);
            }
        }
        for(int i : candy) {
            ans += i;
        }
        //if (ratings[0] )
        return ans;
    }
}
// @lc code=end

