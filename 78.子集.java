import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> cb5f86a (add solutions from home PC)

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
<<<<<<< HEAD
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
=======
        list = new ArrayList<>();
        backtracking(nums, 0);
        return ans;
    }

    private void backtracking(int[] nums, int index) {
        ans.add(new ArrayList<>(list));
        if (index >= nums.length) return;
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(nums, i + 1);
>>>>>>> cb5f86a (add solutions from home PC)
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end

