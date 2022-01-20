import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=491 lang=java
 *
 * [491] 递增子序列
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> tmp;
    // boolean[] map = new boolean[201];

    public List<List<Integer>> findSubsequences(int[] nums) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        backtracking(nums, 0);
        return ans;
    }

    private void backtracking(int[] nums, int index) {
        if (tmp.size() > 1) {
            ans.add(new ArrayList<>(tmp));
        }
        if (index >= nums.length) return;
        Set<Integer> visited = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if ((tmp.isEmpty() || nums[i] >= tmp.get(tmp.size() - 1)) && !visited.contains(nums[i])) {
                tmp.add(nums[i]);
                backtracking(nums, i + 1);
                tmp.remove(tmp.size() - 1);
                visited.add(nums[i]);
            }
            // map[nums[i] + 100] = true;
        }
    }
}
// @lc code=end

