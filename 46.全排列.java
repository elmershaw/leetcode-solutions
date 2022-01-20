/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
// @lc code=start
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> tmp;
    private Set<Integer> visited;

    public List<List<Integer>> permute(int[] nums) {
	ans = new ArrayList<>();
        tmp = new ArrayList<>();
        visited = new HashSet<>();
        backtracking(nums);
        return ans;
    }

    private void backtracking(int[] nums) {
        if (tmp.size() == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited.contains(nums[i])) {
                visited.add(nums[i]);
                tmp.add(nums[i]);
                backtracking(nums);
                tmp.remove(tmp.size() - 1);
                visited.remove(nums[i]);
            }
        }
    }
}
// @lc code=end

// @lc code=end

