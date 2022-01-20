/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
<<<<<<< HEAD
            // char tmp = s[l];
            // s[l] = s[r];
            // s[r] = tmp;
            s[l] ^= s[r];
            s[r] ^= s[l];
            s[l] ^= s[r];
=======
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
>>>>>>> cb5f86a (add solutions from home PC)
            l++;
            r--;
        }
    }
}
// @lc code=end

