import java.util.List;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    String[] map = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    List<String> ans;
    StringBuilder sb = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;
        build(digits, 0);
        return ans;
    }

    private void build(String digits, int index) {
        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        int i = digits.charAt(index) - '0';
        String letters = map[i];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            build(digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
// @lc code=end

