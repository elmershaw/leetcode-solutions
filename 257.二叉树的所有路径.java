<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.util.List;
import java.util.StringJoiner;
>>>>>>> cb5f86a (add solutions from home PC)

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
<<<<<<< HEAD
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;
        find(root, "", ans);
        return ans;
    }

    private void find(TreeNode root, String path, List<String> ans) {
        path += root.val;
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        if (root.left != null) find(root.left, path + "->", ans);
        if (root.right != null) find(root.right, path + "->", ans);
=======
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> paths = new ArrayList<>();
        traversal(root, paths, res);
        return res;
    }

    private void traversal(TreeNode root, List<Integer> paths, List<String> res) {
        paths.add(root.val);
        // 叶子结点
        if (root.left == null && root.right == null) {
            // 输出
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paths.size() - 1; i++) {
                sb.append(paths.get(i)).append("->");
            }
            sb.append(paths.get(paths.size() - 1));
            res.add(sb.toString());
            return;
        }
        if (root.left != null) {
            traversal(root.left, paths, res);
            paths.remove(paths.size() - 1);// 回溯
        }
        if (root.right != null) {
            traversal(root.right, paths, res);
            paths.remove(paths.size() - 1);// 回溯
        }
>>>>>>> cb5f86a (add solutions from home PC)
    }
}
// @lc code=end

