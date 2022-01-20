import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    // TreeNode pre;
    private long prev = (long)Integer.MIN_VALUE - 1;

    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }

    private boolean inOrder(TreeNode root) {
        if (root == null) return true;
        if (!inOrder(root.left)) return false;
        if (prev >= root.val) {
            return false;
        }
        prev = root.val;
        
        if (!inOrder(root.right)) return false;
        return true;
    }
}
// @lc code=end

