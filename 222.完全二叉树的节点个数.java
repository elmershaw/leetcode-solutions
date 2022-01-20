<<<<<<< HEAD
=======
import java.util.Deque;

import javax.swing.tree.TreeNode;

>>>>>>> cb5f86a (add solutions from home PC)
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
<<<<<<< HEAD
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
=======
        if(root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        if (leftDepth == rightDepth) {// 左子树是满二叉树
            // 2^leftDepth其实是 （2^leftDepth - 1） + 1 ，左子树 + 根结点
            return (1 << leftDepth) + countNodes(root.right);
        } else {// 右子树是满二叉树
            return (1 << rightDepth) + countNodes(root.left);
        }
    }

    private int getDepth(TreeNode root) {
        int depth = 0;
        while (root != null) {
            root = root.left;
            depth++;
        }
        return depth;
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

