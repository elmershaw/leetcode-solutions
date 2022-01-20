import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sCounts = 0;
        int tCounts = 0;
        int sIdx = s.length() - 1;
        int tIdx = t.length() - 1;
        while (true) {
            while (sIdx >= 0) {
                if (s.charAt(sIdx) == '#') {
                    sCounts++;
                } else if (sCounts == 0) {
                    break;
                } else {
                    //sIdx--;
                    sCounts--;
                }
                sIdx--;
            }
            while (tIdx >= 0) {
                if (t.charAt(tIdx) == '#') {
                    tCounts++;
                } else if (tCounts == 0) {
                    break;
                } else {
                    tCounts--;
                }
                tIdx--;
                //tCounts--;
            }
            if (sIdx < 0 || tIdx < 0) {
                break;
            }
            if (s.charAt(sIdx) != t.charAt(tIdx)) {
                return false;
            }
            sIdx--;
            tIdx--;
        }   
        if (sIdx < 0 && tIdx < 0) {
            return true;
        }
        return false;
    }
}
// @lc code=end

