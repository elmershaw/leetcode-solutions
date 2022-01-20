import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> tmp;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        backtracking(nums, 0);
        return ans;
    }

    private void backtracking(int[] nums, int index) {
        ans.add(new ArrayList<>(tmp));
        if (index >= nums.length) return;
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            tmp.add(nums[i]);
            backtracking(nums, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
// @lc code=end

