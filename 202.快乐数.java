import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        //int n = 0;
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextInt(n);
        }
        return n == 1;
    }

    private int getNextInt(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
// @lc code=end

