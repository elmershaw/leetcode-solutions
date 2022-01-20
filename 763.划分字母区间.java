import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
            }
        }
        return list;
    }
}
// @lc code=end

