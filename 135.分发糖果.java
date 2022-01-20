/*
 * @lc app=leetcode.cn id=135 lang=java
 *
 * [135] 分发糖果
 */

// @lc code=start
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
<<<<<<< HEAD
        int ans = n;
        int[] candy = new int[n];
        
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
=======
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        // candies[0] = 0;
        // candies[n + 1] = 0;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
>>>>>>> cb5f86a (add solutions from home PC)
            }
        }
        for (int j = n - 2; j >= 0; j--) {
            if (ratings[j] > ratings[j + 1]) {
<<<<<<< HEAD
                candy[j] = Math.max(candy[j], candy[j + 1] + 1);
            }
        }
        for(int i : candy) {
            ans += i;
        }
        //if (ratings[0] )
        return ans;
=======
                candies[j] = Math.max(candies[j], candies[j + 1] + 1);
            }
        }
        return Arrays.stream(candies).sum();
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

