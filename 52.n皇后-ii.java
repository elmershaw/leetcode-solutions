import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=52 lang=java
 *
 * [52] N皇后 II
 */

// @lc code=start
class Solution {
    private Map<Integer, Integer> visited = new HashMap<>();
    private boolean[] seen1 = new boolean[17];
    private boolean[] seen2 = new boolean[17];
    private int ans = 0;

    public int totalNQueens(int n) {
        find(n, 0);
        return ans;    
    }

    private void find(int n, int i) {
        if (i == n) {
            ans++;
            //System.out.println(visited);;
            return;
        }
        for (int j = 0; j < n; j++) {
            if (visited.containsValue(j)) {
                continue;
            }
            if (seen1[j - i + n - 1] || seen2[j + i]) {
                continue;
            }
            visited.put(i, j);
            seen1[j - i + n - 1] = true;
            seen2[j + i] = true;
            find(n, i + 1);
            visited.remove(i);
            seen2[j + i] = false;
            seen1[j - i + n - 1] = false;
        }
    }
}
// @lc code=end

