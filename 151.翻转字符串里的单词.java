/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 翻转字符串里的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int slow = 0;
        int fast = 0;
        int end = chars.length - 1;
        while (chars[fast] == ' ') {
            fast++;
        }
        while (chars[end] == ' ') {
            end--;
        }
        for (; fast <= end; fast++) {
            if (chars[fast] == ' ' && chars[fast - 1] == ' ') {
                continue;
            }
            chars[slow] = chars[fast];
            slow++;
        }
        reverse(chars, 0, slow - 1);
        int l = 0;
        for (int i = 0; i < slow; i++) {
            if (chars[i] == ' ') {
                reverse(chars, l, i - 1);
                l = i + 1;
            }
        }
        reverse(chars, l, slow - 1);
        return String.copyValueOf(chars, 0, slow);
    }

    private void reverse(char[] chars, int l, int r) {
        while (l < r) {
            chars[l] ^= chars[r];
            chars[r] ^= chars[l];
            chars[l] ^= chars[r];
            r--;
            l++;
        }
    }
}
// @lc code=end
