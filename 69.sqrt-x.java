/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        int i = x;
        int j = 0;
        while (i > 1) {
            j = i;
            i = i >> 1;
            if (x / i >= i) {
                while (i <= j) {
                    int m = ((j - i) >> 1) + i;
                    if (m == x / m) return m;
                    if (m > x / m) {
                        j = m - 1;
                    } else {
                        i = m + 1;
                    }
                }
                break;
            }
        }
        return j;
    }
}
// @lc code=end

