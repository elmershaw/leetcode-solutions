import java.util.Deque;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=538 lang=java
 *
 * [538] 把二叉搜索树转换为累加树
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
    // private int sum;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cursor = root;
        int sum = 0;
        while (cursor != null || !stack.isEmpty()) {
            if (cursor != null) {
                stack.push(cursor);
                cursor = cursor.right;
            } else {
                cursor = stack.pop();
                cursor.val += sum;
                sum = cursor.val;
                cursor = cursor.left;
            }
        }
        return root;
    }
}
// @lc code=end

