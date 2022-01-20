/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int n = s.length();
        int[] sMap = new int[26];
        int[] tMap = new int[26];
        //int counts = 0;
        for (int i = 0; i < n; i++) {
            sMap[s.charAt(i) - 'a']++;
            tMap[t.charAt(i) - 'a']++;
        }
        for (int j = 0; j < 26; j++) {
            if (sMap[j] != tMap[j]) return false;
        }
        return true;
    }
}
// @lc code=end

