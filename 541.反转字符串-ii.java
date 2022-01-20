/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += k * 2) {
            if (i + k < chars.length) {
                reverse(chars, i, i + k - 1);
            } else {
                reverse(chars, i, chars.length - 1);
            }
        }
        return String.valueOf(chars);
    }

    private void reverse(char[] chars, int l, int r) {
        while (l < r) {
            chars[l] ^= chars[r];
            chars[r] ^= chars[l];
            chars[l] ^= chars[r];
            l++;
            r--;
        }
    }
}
// @lc code=end

