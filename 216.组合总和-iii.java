<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> cb5f86a (add solutions from home PC)
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
    List<List<Integer>> ans;
    List<Integer> list;

    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        list = new ArrayList<>();
        build(1, 0, k, n);
        return ans;
    }

    private void build(int i, int sum, int k, int n) {
        if (list.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for (int j = i; j <= n - sum && j < 10; j++) {
            list.add(Integer.valueOf(j));
            build(j + 1, sum + j, k, n);
            list.remove(Integer.valueOf(j));
=======
    private List<List<Integer>> ans;
    private List<Integer> tmp;
    private int sum;
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        backTracing(k, n, 1);
        return ans;
    }

    private void backTracing(int k, int n, int x) {
        if (sum == n && tmp.size() == k) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = x; i < 10 && i + sum <= n && tmp.size() < k; i++) {
            tmp.add(i);
            sum += i;
            backTracing(k, n, i + 1);
            sum -= i;
            tmp.remove(Integer.valueOf(i));
>>>>>>> cb5f86a (add solutions from home PC)
        }
    }
}
// @lc code=end

