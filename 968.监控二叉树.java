/*
 * @lc app=leetcode.cn id=968 lang=java
 *
 * [968] 监控二叉树
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
<<<<<<< HEAD
    public int minCameraCover(TreeNode root) {
        traversal(root, false);
    }

    private void traversal(TreeNode root, boolean monitered) {
        if (root == null) {return;}
        if (!monitered) {
            
=======
    private int ans;

    public int minCameraCover(TreeNode root) {
        if (traverse(root) == 0) ans++;
        return ans;
    }

    private int traverse(TreeNode root) {
        if (root == null) return 2;
        int l = traverse(root.left);
        int r = traverse(root.right);
        if (l * r == 0) {
            ans++;
            return 1;
        } else if (l == 1 || r == 1) {
            return 2;
        } else {
            return 0;
>>>>>>> cb5f86a (add solutions from home PC)
        }
    }
}
// @lc code=end

