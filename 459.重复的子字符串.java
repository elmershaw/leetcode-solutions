/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        //if (n % 2 == 1) return false;
        int[] next = new int[n];
        int j = -1;
        next[0] = j;
        for (int i = 1; i < n; i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j+1))
                j = next[j];
            if (s.charAt(i) == s.charAt(j+1))
                j++;
            next[i] = j;
        }
        if (next[n - 1] >= 0 && n % (n - next[n - 1] - 1) == 0) {
            return true;
        }
        return false;
    }
}
// @lc code=end

