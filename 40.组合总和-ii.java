import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> list;
    private int sum;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans = new ArrayList<>();
        list = new ArrayList<>();
        backTracing(candidates, target, 0);
        return ans;
    }

    private void backTracing(int[] candidates, int target, int index) {
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        } //else if (sum > target) return;
        for (int i = index; i < candidates.length && sum + candidates[i] <= target; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            sum += candidates[i];
            backTracing(candidates, target, i + 1);
            sum -= candidates[i];
            list.remove(Integer.valueOf(candidates[i]));
        }
    }
}
// @lc code=end

