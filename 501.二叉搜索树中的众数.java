import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
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
    private List<Integer> ans;
    private TreeNode prev;
    private int mode;
    private int curr;

    public int[] findMode(TreeNode root) {
        ans = new ArrayList<>();
        traverse(root);
        if (curr > mode) {
            ans.clear();
            ans.add(prev.val);
        } else if (curr == mode) {
            ans.add(prev.val);
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        if (prev == null) {
            // prev = root;
            curr = 1;
        } else if (root.val > prev.val) {
            if (curr > mode) {
                ans.clear();
                ans.add(prev.val);
                mode = curr;
            } else if (curr == mode) {
                ans.add(prev.val);
            }
            curr = 1;
        } else {
            curr++;
        }
        prev = root;
        traverse(root.right);
    }
}
// @lc code=end

