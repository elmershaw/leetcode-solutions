/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) 
            return null;
        return build(inorder, postorder, 0, inorder.length - 1, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int l, int r, int k) {
        if (l > r) return null;
        int val = postorder[k];
        TreeNode root = new TreeNode(postorder[k]);
        if (l == r) return root;
        int i = l;
        while (i <= r) {
            if (inorder[i] == val) break;
            i++;
        }
        root.left = build(inorder, postorder, l, i - 1, k - r + i - 1);
        root.right = build(inorder, postorder, i + 1, r, k - 1);
        return root;
        
    }
}
// @lc code=end

