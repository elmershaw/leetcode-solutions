import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> tmp;
    private int sum;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        backTracing(candidates, target, 0);
        return ans;
    }

    private void backTracing(int[] candidates, int target, int index) {
        if (sum == target) {
            ans.add(new ArrayList<>(tmp));
            return;
        } else if (sum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            tmp.add(candidates[i]);
            sum += candidates[i];
            backTracing(candidates, target, i);
            sum -= candidates[i];
            tmp.remove(Integer.valueOf(candidates[i]));
        }
    }
}
// @lc code=end

