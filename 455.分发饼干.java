<<<<<<< HEAD
=======
import java.util.Arrays;

>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
<<<<<<< HEAD
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int j = 0;
        for (int i = 0; i < s.length && j < g.length; i++) {
            if (g[j] <= s[i]) {
                count++;
                j++;
            }
        }
        return count;
=======
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                ans++;
                i++;
            }
            j++;
        }
        return ans;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

