/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
<<<<<<< HEAD
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
=======
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            map[t.charAt(i) - 'a']--;
        }
        for (int j = 0; j < 26; j++) {
            if (map[j] != 0) {
                return false;
            }
>>>>>>> cb5f86a (add solutions from home PC)
        }
        return true;
    }
}
// @lc code=end

