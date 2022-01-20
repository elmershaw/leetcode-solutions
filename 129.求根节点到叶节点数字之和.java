import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根节点到叶节点数字之和
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
    private List<Integer> paths = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        traverse(root, 0);
        return paths.stream().mapToInt(i -> i).sum();
    }

    private void traverse(TreeNode root, int path) {
        path = path * 10 + root.val;
        if (root.left == null && root.right == null) {
            paths.add(path);
            return;
        }
        if (root.left != null) {
            traverse(root.left, path);
        }
        if (root.right != null) {
            traverse(root.right, path);
        }
    }
}
// @lc code=end

