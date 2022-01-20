import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        // vector<int> freq(128);
        // for (char c : t) ++freq[c];
        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            ++freq[c];
        }
        int start = 0;
        int l = Integer.MAX_VALUE;
        int i = 0;
        int left = m;
        for (int j = 0; j < n; ++j) {
            if (--freq[s.charAt(j)] >= 0)
                --left;
            while (left == 0) {
                if (j - i + 1 < l) {
                    l = j - i + 1;
                    start = i;
                }
                if (++freq[s.charAt(i++)] == 1)
                    ++left;
            }
        }
        return l == Integer.MAX_VALUE ? "" : s.substring(start, start + l);
        // Map<Character, Integer> map = new HashMap<>();
        // for (char c : t.toCharArray()) {
        // map.compute(c, (k, v) -> v == null ? 1 : v + 1);
        // }
        // Map<Character, Integer> tmp = new HashMap<>(map);
        // int l = 0;
        // int curL = 0;
        // for (int i = 0 ; i < s.length(); i++) {
        // if (map.containsKey(s.charAt(i))) {
        // curL = i;
        // break;
        // }
        // }
        // // System.out.println(curL);
        // int minL = s.length() - 1;
        // for (int i = curL; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (tmp.containsKey(c)) {
        // tmp.compute(c, (k, v) -> v > 0 ? v - 1 : 0);
        // if (tmp.get(c) == 0) {
        // tmp.remove(c);
        // }
        // if (tmp.size() == 0) {
        // System.out.println(s.substring(curL, i + 1));
        // if (minL > i - curL) {
        // minL = i - curL;
        // l = curL;
        // }
        // tmp.put(s.charAt(curL), 1);
        // for (int j = curL + 1; j < s.length(); j++) {
        // if (map.containsKey(s.charAt(j))) {
        // curL = j;
        // break;
        // }
        // }
        // System.out.println(tmp);
        // System.out.println(s.charAt(curL));

        // }
        // }
        // }
        // return s.substring(l, minL);
    }
}
// @lc code=end
