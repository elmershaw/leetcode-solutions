/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
<<<<<<< HEAD
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int l, int r) {
        if (l >= r) {
            return null;
        }
        if (l == r - 1) {
            return new TreeNode(nums[l]);
        }
        int maxIndex = 0;
        int maxValue = -1;
        for (int i = l; i < r; i++) {
            if (nums[i] > maxValue) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxValue);
        root.left = construct(nums, l, maxIndex);
        root.right = construct(nums, maxIndex + 1, r);
=======

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return bt(nums, 0, nums.length - 1);
    }

    private TreeNode bt(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] > nums[m]) {
                m = i;
            }
        }
        TreeNode root = new TreeNode(nums[m]);
        root.left = bt(nums, l, m - 1);
        root.right = bt(nums, m + 1, r);
>>>>>>> cb5f86a (add solutions from home PC)
        return root;
    }
}
// @lc code=end

