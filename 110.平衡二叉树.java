/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        return find(root) >= 0;
    }

    private int find(TreeNode root) {
        if (root == null) return 0;
        int lh = find(root.left);
        int rh = find(root.right);
        if (lh < 0 || rh < 0) return -1;

        return Math.abs(lh - rh) <= 1 ? 
                Math.max(lh, rh) + 1 : -1;
=======
    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        find(root);
        return flag;
    }

    private int find(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = find(root.left);
        int rd = find(root.right);
        if (Math.abs(ld - rd) > 1) {
            flag = false;
        }
        return Math.max(ld, rd) + 1;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

