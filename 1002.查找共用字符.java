import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1002 lang=java
 *
 * [1002] 查找共用字符
 */

// @lc code=start
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
<<<<<<< HEAD
        if (words.length == 0) return ans;
        int n = words[0].length();
        int[] hash = new int[26];
        for (int i = 0; i < n; i++) {
            hash[words[0].charAt(i) - 'a']++;
        }
        for (int j = 1; j < words.length; j++) {
            int[] tmpHash = new int[26];
            for (int k = 0; k < words[j].length(); k++) {
                tmpHash[words[j].charAt(k) - 'a']++;
            }
            for (int m = 0; m < 26; m++) {
                hash[m] = Math.min(hash[m], tmpHash[m]);
            }
        }
        for (int m = 0; m < 26; m++) {
            while (hash[m] > 0) {
                ans.add(String.valueOf((char)(m + 'a')));
                hash[m]--;
=======
        int[] map = new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            map[words[0].charAt(i) - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] tmp = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                tmp[words[i].charAt(j) - 'a']++;
            }
            for (int m = 0; m < 26; m++) {
                map[m] = Math.min(map[m], tmp[m]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (map[i]-- > 0) {
                ans.add(String.valueOf((char)(i + 'a')));
>>>>>>> cb5f86a (add solutions from home PC)
            }
        }
        return ans;
    }
}
// @lc code=end

