import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=450 lang=java
 *
 * [450] 删除二叉搜索树中的节点
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
    private TreeNode dummy;

    public TreeNode deleteNode(TreeNode root, int key) {
        dummy = new TreeNode();
        dummy.left = root;
        find(root, key, dummy);
        return dummy.left;
    }

    private void find(TreeNode root, int key, TreeNode prev) {
        if (root == null) return;
        if (root.val == key) {
            TreeNode candidate = null;
            if (root.right != null) {
                candidate = root.right;
                TreeNode cursor = root.right;
                while (cursor.left != null) {
                    cursor = cursor.left;
                }
                cursor.left = root.left;
            } else {
                candidate = root.left;
            }
            if (prev.left == root) {
                prev.left = candidate;
            } else {
                prev.right = candidate;
            }
            return;
        }
        find(root.left, key, root);
        find(root.right, key, root);
    }
}
// @lc code=end

