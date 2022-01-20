import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            char token = tokens[i].charAt(0);
            if (Character.isDigit(token) || tokens[i].length() > 1) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int r = stack.pop();
                int l = stack.pop();
                if (token == '+') {
                    stack.push(l + r);
                } else if (token == '-') {
                    stack.push(l - r);
                } else if (token == '*') {
                    stack.push(l * r);
                } else {
                    stack.push(l / r);
                }
            }
        }
        return stack.pop();
    }
}
// @lc code=end

