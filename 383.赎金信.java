/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
<<<<<<< HEAD
        int[] map = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            map[ransomNote.charAt(i) - 'a']++;
        }
        for (int j = 0; j < magazine.length(); j++) {
            map[magazine.charAt(j) - 'a']--;
        }
        for (int k = 0; k < 26; k++) {
            if (map[k] > 0) return false;
=======
        int[] mgzMap = new int[26];
        for (char c : magazine.toCharArray()) {
            mgzMap[c - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (mgzMap[ransomNote.charAt(i) - 'a']-- <= 0) {
                return false;
            }
>>>>>>> cb5f86a (add solutions from home PC)
        }
        return true;
    }
}
// @lc code=end

