import java.awt.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    private List<List<String>> ans;
    private List<String> list;

    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        list = new ArrayList<>();
        backTracing(s, 0);
        return ans;
    }

    private void backTracing(String s, int index) {
        if (index >= s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                list.add(s.substring(index, i + 1));
                backTracing(s, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
// @lc code=end

