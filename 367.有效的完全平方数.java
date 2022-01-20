/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        int l = 0;
        int r = num;
        while (l <= r) {
            int m = ((r - l) >> 1) + l;
            //System.out.println(m);
            if ((double)num / m - m == 0) return true;
            if ((double)num / m > m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}
// @lc code=end

