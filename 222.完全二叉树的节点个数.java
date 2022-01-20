/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int lh = 0;
        int rh = 0;
        while (left != null) {
            left = left.left;
            lh++;
        }
        while (right != null) {
            right = right.right;
            rh++;
        }
        if (lh == rh) {
            return (2 << lh) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
// @lc code=end

