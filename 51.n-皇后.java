import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    private Map<Integer, Integer> visited;
    private List<List<String>> ans;
    private List<String> list;
    private char[] template;
    

    public List<List<String>> solveNQueens(int n) {
        visited = new HashMap<>();
        ans = new ArrayList<>();
        list = new ArrayList<>(n);
        template = new char[n];
        Arrays.fill(template, '.');
        backtracking(n, 0);
        return ans;
    }

    private void backtracking(int n, int row) {
        if (row == n) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(row, i)) {
                visited.put(i, row);
                // System.out.print(Arrays.toString(template));
                template[i] = 'Q';
                list.add(String.valueOf(template));
                // System.out.println(list.toString());
                template[i] = '.';
                backtracking(n, row + 1);
                list.remove(list.size() - 1);
                visited.remove(i);
            }
        }
    }

    private boolean isValid(int row, int col) {
        if (visited.containsKey(col)) {
            return false;
        }
        for (Map.Entry<Integer, Integer> e : visited.entrySet()) {
            int c = e.getKey();
            int r = e.getValue();
            if (r - c == row - col || r + c == row + col) return false;
        }
        return true;
    }

    // private String makeString(int col) {

    // }
}
// @lc code=end

