<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans;
<<<<<<< HEAD
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
=======
    private List<Integer> list;
    private  boolean[] visited;

    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        if (nums == null) return ans;
        list = new ArrayList<>();
        visited = new boolean[nums.length];
        Arrays.sort(nums);
        permutationWithoutRepeat(nums);
        return ans;
    }

    private void permutationWithoutRepeat(int[] nums) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            if (!visited[i]) {
                visited[i] = true;
                list.add(nums[i]);
                permutationWithoutRepeat(nums);
                list.remove(list.size() - 1);
>>>>>>> cb5f86a (add solutions from home PC)
                visited[i] = false;
            }
        }
    }
}
// @lc code=end

