/*
 * @lc app=leetcode.cn id=925 lang=java
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;
        int i = 0;
        int j = 0;
        for (; j < typed.length(); j++) {
            if (i == name.length()) break;
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                continue;
            } else {
                return false;
            }
        }
        if (i != name.length()) return false;
        while (j < typed.length()) {
            if (typed.charAt(j) != typed.charAt(j - 1)) return false;
            j++;
        }
        return true;
    }
}
// @lc code=end

