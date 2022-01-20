/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return find(root,0);
    }

    private boolean find(TreeNode root, int pathSum) {
        if (root == null) return false;
        // int val = root.val;
        int tmpSum = root.val + pathSum;
        if (tmpSum == target && root.left == null && root.right == null) {
            return true;
        } else {
            return find(root.left, tmpSum) | find(root.right, tmpSum);
        }

    }
}
// @lc code=end

