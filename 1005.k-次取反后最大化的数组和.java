import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1005 lang=java
 *
 * [1005] K 次取反后最大化的数组和
 */

// @lc code=start
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k <= 0) {
                sum += nums[i];
                continue;
            } 
            if (nums[i] < 0) {
                sum += -nums[i];
                k--;
                continue;
            }
            if (k % 2 != 0) {
                if (i == 0 || nums[i] <= -nums[i - 1]) {
                    sum += -nums[i];
                } else {
                    sum += ((nums[i - 1] << 1) + nums[i]);
                }
            } else {
                sum += nums[i];
            }
            k = 0;
        }
        if (k > 0) {
            if (k % 2 != 0) {
                sum += (nums[nums.length - 1] << 1);
            }
        }
        return sum;
    }
}
// @lc code=end

