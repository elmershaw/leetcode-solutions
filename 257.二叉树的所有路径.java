import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;
        find(root, "", ans);
        return ans;
    }

    private void find(TreeNode root, String path, List<String> ans) {
        path += root.val;
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        if (root.left != null) find(root.left, path + "->", ans);
        if (root.right != null) find(root.right, path + "->", ans);
    }
}
// @lc code=end

