import java.util.ArrayList;
import java.util.Arrays;
<<<<<<< HEAD
import java.util.LinkedList;
import java.util.List;
=======
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
>>>>>>> cb5f86a (add solutions from home PC)

/*
 * @lc app=leetcode.cn id=763 lang=java
 *
 * [763] 划分字母区间
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int[] edge = new int[26];
<<<<<<< HEAD
        for (int i = 0; i < s.length(); i++) {
            edge[s.charAt(i) - 'a'] = i;
        }
        int l = 0;
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            r = Math.max(r, edge[s.charAt(i) - 'a']);
            if (i == r) {
                list.add(r - l + 1);
                l = i + 1;
=======
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            edge[chars[i] - 'a'] = i;
        }
        int idx = 0;
        int last = -1;
        for (int i = 0; i < chars.length; i++) {
            idx = Math.max(idx,edge[chars[i] - 'a']);
            if (i == idx) {
                list.add(i - last);
                last = i;
>>>>>>> cb5f86a (add solutions from home PC)
            }
        }
        return list;
    }
}
// @lc code=end

