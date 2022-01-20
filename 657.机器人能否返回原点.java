/*
 * @lc app=leetcode.cn id=657 lang=java
 *
 * [657] 机器人能否返回原点
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                horizontal++;
            } else if (moves.charAt(i) == 'L') {
                horizontal--;
            } else if (moves.charAt(i) == 'U') {
                vertical++;
            } else {
                vertical--;
            }
        }

        return horizontal == 0 && vertical == 0;
    }
}
// @lc code=end

