import java.util.Map;

/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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
    public int rob(TreeNode root) {
        int[] res = loot(root);
        return Math.max(res[0], res[1]);
    }

    private int[] loot(TreeNode root) {
        int[] val = new int[2];
        if (root == null) {
            return val;
        }
        int[] lv = loot(root.left);
        int[] rv = loot(root.right);
        val[1] = root.val + lv[0] + rv[0];
        val[0] = Math.max(lv[0], lv[1]) + Math.max(rv[0], rv[1]);
        return val;
    }
}
// @lc code=end

