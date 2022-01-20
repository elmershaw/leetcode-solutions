/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int lv = sumOfLeftLeaves(root.left);
        int rv = sumOfLeftLeaves(root.right);
        int mv = 0;
        if (root.left != null && root.left.left == null && 
                root.left.right == null)
            mv = root.left.val;
        return lv + rv + mv;
=======
    private int ans;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root);
        return ans;
    }

    private void traverse(TreeNode root) {
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                ans += root.left.val;
            } else {
                traverse(root.left);
            }
        }
        if (root.right != null) {
            traverse(root.right);
        }
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

