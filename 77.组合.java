<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> cb5f86a (add solutions from home PC)
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
<<<<<<< HEAD
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        traversal(n, k, 1, ans, new ArrayList<Integer>());
        return ans;
    }

    private void traversal(int n, int k, int i, List<List<Integer>> ans, List<Integer> list) {
        //list.add(Integer.valueOf(i));
        if (list.size() == k) {
            //list.add(i);
            ans.add(new ArrayList<>(list));
            //list.remove(Integer.valueOf(i));
            return;
        }
        for (int j = i; j <= n - (k - list.size()) + 1; j++) {
            list.add(Integer.valueOf(j));
            traversal(n, k, j + 1, ans, list);
            list.remove(Integer.valueOf(j));
        }
        //list.remove(Integer.valueOf(i));
=======
    private List<List<Integer>> ans;
    private List<Integer> tmp;

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        traceBack(n, k, 1);
        return ans;
    }

    private void traceBack(int n, int k, int x) {
        if (tmp.size() == k) {
            ans.add(new ArrayList<>(tmp));
            // tmp.clear();
            return;
        }
        for (int i = x; k - tmp.size() <= n - i + 1; i++) {
            tmp.add(i);
            traceBack(n, k, i + 1);
            tmp.remove(Integer.valueOf(i));
        }
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

