<<<<<<< HEAD
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

=======
>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=738 lang=java
 *
 * [738] 单调递增的数字
 */

// @lc code=start
class Solution {
    public int monotoneIncreasingDigits(int n) {
<<<<<<< HEAD
        String[] strings = (n + "").split("");
        int start = strings.length;
        for (int i = strings.length - 1; i > 0; i--) {
            if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i - 1])) {
                strings[i - 1] = (Integer.parseInt(strings[i - 1]) - 1) + "";
                start = i;
            }
        }
        for (int i = start; i < strings.length; i++) {
            strings[i] = "9";
        }
        return Integer.parseInt(String.join("", strings));
=======
        if (n==0)return 0;
        char[] num = (n + "").toCharArray();
        int flag = num.length;
        for (int i = num.length - 1; i > 0; i--) {
            if (num[i] < num[i - 1]) {
                flag = i;
                num[i - 1]--;
            }
        }
        for (int j = flag; j < num.length; j++) {
            num[j] = '9';
        }
        return Integer.parseInt(String.valueOf(num));
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

