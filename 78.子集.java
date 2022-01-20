import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> list;

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        if (nums == null) return ans;
        list = new ArrayList<>();
        findSubset(nums, 0);
        return ans;
    }

    private void findSubset(int[] nums, int index) {
        ans.add(new ArrayList<>(list));
        if (index >= nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            findSubset(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end

