import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        if (root == null) return ans;
        findTarget(root, targetSum, new ArrayList<Integer>());
        return ans;
    }

    private void findTarget(TreeNode root, int target, List<Integer> list) {
        list.add(root.val);
        if (target == root.val && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        if (root.left != null) {
            findTarget(root.left, target - root.val, list);
        }
        if (root.right != null) {
            findTarget(root.right, target - root.val, list);
        }
        list.remove(list.size() - 1);
        
    }
}
// @lc code=end

