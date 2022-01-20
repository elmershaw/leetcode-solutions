import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        traversal(n, k, 1, ans, new ArrayList<Integer>());
        return ans;
    }

    private void traversal(int n, int k, int i, List<List<Integer>> ans, List<Integer> list) {
        //list.add(Integer.valueOf(i));
        if (list.size() == k) {
            //list.add(i);
            ans.add(new ArrayList<>(list));
            //list.remove(Integer.valueOf(i));
            return;
        }
        for (int j = i; j <= n - (k - list.size()) + 1; j++) {
            list.add(Integer.valueOf(j));
            traversal(n, k, j + 1, ans, list);
            list.remove(Integer.valueOf(j));
        }
        //list.remove(Integer.valueOf(i));
    }
}
// @lc code=end

