<<<<<<< HEAD
import java.util.List;
=======
import java.util.ArrayList;
>>>>>>> cb5f86a (add solutions from home PC)

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
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
=======
    private List<String> ans;
    // private List<Character> tmp;
    private StringBuilder sb;
    private final String[] MAP = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        // List<List<Character>> map = new ArrayList<>(List.of(
        //     List.of('a')
        // ));
        ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;
        sb = new StringBuilder();
        backTracing(digits, 0);
        return ans;
    }

    private void backTracing(String digits, int index) {
        if (digits.length() == index) {
            ans.add(sb.toString());
            return;
        }
        String s = MAP[digits.charAt(index) - '0'];
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backTracing(digits, index + 1);
>>>>>>> cb5f86a (add solutions from home PC)
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
// @lc code=end

