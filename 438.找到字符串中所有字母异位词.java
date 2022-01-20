import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;
        int n = p.length();
        int[] map = new int[26];
        //int[] tmp = new int[26];
        int count;
        for (int i = 0; i < n; i++) {
            map[p.charAt(i) - 'a']++;
            map[s.charAt(i) - 'a']--;
        }
        boolean tmpflag = true;
        for (int k = 0; k < 26; k++) {
            if (map[k] != 0) {
                tmpflag = false;
                break;
            }
        }
        if (tmpflag) ans.add(0);
        for (int j = 1; j <= s.length() - n; j++) {
            map[s.charAt(j - 1) - 'a']++;
            map[s.charAt(j + n - 1) - 'a']--;
            boolean flag = true;
            for (int k = 0; k < 26; k++) {
                if (map[k] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans.add(j);
        }
        return ans;
    }
}
// @lc code=end

