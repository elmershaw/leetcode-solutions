/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> tmp;
    private boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        visited = new boolean[nums.length];
        backtracking(nums);
        return ans;
    }

    private void backtracking(int[] nums) {
        if (tmp.size() == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
                visited[i] = true;
                tmp.add(nums[i]);
                backtracking(nums);
                tmp.remove(tmp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
// @lc code=end

