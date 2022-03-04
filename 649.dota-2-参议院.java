import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=649 lang=java
 *
 * [649] Dota2 参议院
 */

// @lc code=start
class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        int flag = 0;
        boolean R = true;
        boolean D = true;
        char[] s = senate.toCharArray();
        while (R && D) {
            R = false;
            D = false;
            for (int i = 0; i < n; i++) {
                if (s[i] == 'R') {
                    if (flag < 0) s[i] = 0;
                    else R = true;
                    flag++;
                }
                if (s[i] == 'D') {
                    if (flag > 0) s[i] = 0;
                    else D = true;
                    flag--;
                }
            }
        }
        if (R) return "Radiant";
        return "Dire";
    }
}
// @lc code=end

