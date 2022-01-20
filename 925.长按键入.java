/*
 * @lc app=leetcode.cn id=925 lang=java
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == typed.charAt(j)) {
                j++;
            } else {
                while (j > 0 && j < typed.length() && typed.charAt(j) == typed.charAt(j - 1)) {
                    j++;
                }
                if (name.length() - i > typed.length() - j) {
                    return false;
                }
                if (name.charAt(i) != typed.charAt(j)) {
                    return false;
                }
                j++;
            }
        }
        while (j > 0 && j < typed.length() && typed.charAt(j) == typed.charAt(j - 1)) {
            j++;
        }
        if (j != typed.length()) {
            return false;
        }
        return true;
    }
}
// @lc code=end

