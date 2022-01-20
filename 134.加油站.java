import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] gap = new int[n];
        int gapSum = 0;
        for (int i = 0; i < n; i++) {
            gap[i] = gas[i] - cost[i];
            gapSum += gap[i];
        }
        if (gapSum < 0) return -1;
        // int sum = 0;
        int tmp = 0;
        int l = 0;
        for (int j = 0; j < n; j++) {
            if (tmp + gap[j] < 0) {
                l = j + 1;
                tmp = 0;
            } else {
                tmp += gap[j];
            }
            // System.out.println(tmp);
        }
        return l % n;
    }
}
// @lc code=end

