<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
<<<<<<< HEAD
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
=======
class Solution {
    private List<List<Integer>> ans;
    private List<Integer> list;
    private boolean[] visited;

    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        if (nums == null) {
            return ans;
        }
        list = new ArrayList<>();
        visited = new boolean[nums.length];
        permutation(nums);
        return ans;
    }

    private void permutation(int[] nums) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(nums[i]);
                permutation(nums);
                list.remove(list.size() - 1);
                visited[i] = false;
>>>>>>> cb5f86a (add solutions from home PC)
            }
        }
    }
}
// @lc code=end

<<<<<<< HEAD
// @lc code=end

=======
>>>>>>> cb5f86a (add solutions from home PC)
