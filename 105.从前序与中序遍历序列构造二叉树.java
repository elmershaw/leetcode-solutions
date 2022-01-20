/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) return null;
        return build(preorder, inorder, 0, preorder.length - 1, 0, preorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int prel, int prer, int inl, int inr) {
        if (inl > inr || prel > prer) return null;
        int val = preorder[prel];
        TreeNode root = new TreeNode(val);
        if (inl == inr) return root;
        int i = inl;
        while (i <= inr) {
            if (inorder[i] == val) break;
            i++;
        }
        root.left = build(preorder, inorder, prel + 1, prel + i - inl, inl, i - 1);
        root.right = build(preorder, inorder, prel + i - inl + 1, prer, i + 1, inr);
        return root;
    }
}
// @lc code=end

