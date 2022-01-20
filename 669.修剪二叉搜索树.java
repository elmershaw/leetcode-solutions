/*
 * @lc app=leetcode.cn id=669 lang=java
 *
 * [669] 修剪二叉搜索树
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        TreeNode l = trimBST(root.left, low, high);
        TreeNode r = trimBST(root.right, low, high);
        if (root.val > high) {
            return l;
        } else if (root.val < low) {
            return r;
        } else {
            root.left = l;
            root.right = r;
            return root;
        }
    }
}
// @lc code=end

