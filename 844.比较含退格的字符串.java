/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        int m = S.length();
        int n = T.length();
        int i = m - 1;
        int j = n - 1;
        int ss = 0;
        int ts = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0 && (ss > 0 || S.charAt(i) == '#')) {
                if (S.charAt(i) == '#') {
                    ss++;
                    i--;
                    continue;
                }
                if (ss > 0) {
                    ss--;
                    i--;
                    // continue;
                }
            }
            while (j >= 0 && (ts > 0 || T.charAt(j) == '#')) {
                if (T.charAt(j) == '#') {
                    ts++;
                    j--;
                    continue;
                }
                if (ts > 0) {
                    ts--;
                    j--;
                    // continue;
                }
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
                i--;
                j--;
        }
        if (Math.abs(i - j) > 0) return false;
        return true;
    }
}
// @lc code=end

