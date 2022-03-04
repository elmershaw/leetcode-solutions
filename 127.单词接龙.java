import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=127 lang=java
 *
 * [127] 单词接龙
 */

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Map<String, List<String>> map = new HashMap<>();
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0;
        // System.out.println("x");
        Set<String> q1 = new HashSet<>();
        Set<String> q2 = new HashSet<>();
        q1.add(beginWord);
        q2.add(endWord);

        int l = beginWord.length();
        int step = 0;
        while (!q1.isEmpty() && !q2.isEmpty()) {
            step++;
            if (q1.size() > q2.size()) {
                Set<String> t = q1;
                q1 = q2;
                q2 = t;
            }
            Set<String> tmp = new HashSet<>();
            for (String s : q1) {
                char[] ca = s.toCharArray();
                for (int i = 0; i < l; i++) {
                    char org = ca[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        ca[i] = c;
                        String candidate = String.valueOf(ca);
                        if (q2.contains(candidate)) return step + 1;
                        if (!dict.contains(candidate)) continue;
                        // System.out.println(candidate);
                        dict.remove(candidate);
                        tmp.add(candidate);
                    }
                    ca[i] = org;
                }
            }
            q1 = tmp;
        }

        return 0;
    }
}
// @lc code=end

