import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans;
    List<Integer> list;

    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        list = new ArrayList<>();
        build(1, 0, k, n);
        return ans;
    }

    private void build(int i, int sum, int k, int n) {
        if (list.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for (int j = i; j <= n - sum && j < 10; j++) {
            list.add(Integer.valueOf(j));
            build(j + 1, sum + j, k, n);
            list.remove(Integer.valueOf(j));
        }
    }
}
// @lc code=end

