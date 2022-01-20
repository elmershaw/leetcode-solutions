<<<<<<< HEAD
import java.util.Arrays;

=======
>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
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
=======
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

