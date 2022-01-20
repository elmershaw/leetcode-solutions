<<<<<<< HEAD
=======
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

>>>>>>> cb5f86a (add solutions from home PC)
/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
<<<<<<< HEAD
        if (root == null) return true;
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        } 
        if (left != null && right == null) {
            return false;
        } 
        if (left == null && right == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        boolean out = compare(left.left, right.right);
        boolean in = compare(left.right, right.left);
        return out & in;
=======
        // return compare(root.left, root.right);
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            
        }
    }

    private boolean compare(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 != null && node2 != null) {
            if (node1.val == node2.val) {
                return compare(node1.left, node2.right) & compare(node1.right, node2.left);
            } else {
                return false;
            }
        } else {
            return false;
        }
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

